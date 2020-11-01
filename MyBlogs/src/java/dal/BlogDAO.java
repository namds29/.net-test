/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import db.DBContext;
import entity.Blog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class BlogDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    db.DBContext db = new DBContext();

    public Blog getTop1() {
        try {
            String sql = "  SELECT a.*,b.name FROM blog AS a INNER JOIN dbo.category AS b ON b.id = a.category_id WHERE timePost like\n"
                    + "           (SELECT MAX(timePost) FROM blog)";
            conn = db.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                Blog b = new Blog(rs.getInt(1), rs.getString(2),
                        rs.getDate(3), rs.getString(4),
                        rs.getString(5), rs.getString(7));
                return b;
            }
        } catch (Exception e) {
        } finally {
            try {
                db.closeConnection(rs, ps, conn);
            } catch (SQLException ex) {
                Logger.getLogger(BlogDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public ArrayList<Blog> getTop3() {
        ArrayList<Blog> list = new ArrayList<>();
        try {
            String sql = "SELECT TOP 3 a.*,b.name FROM blog AS a INNER JOIN dbo.category AS b ON a.category_id =b.id WHERE a.id NOT IN (SELECT id FROM blog WHERE timePost LIKE (SELECT MAX(timePost) FROM blog) )ORDER BY timePost DESC";
            conn = db.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(rs.getInt(1), rs.getString(2),
                        rs.getDate(3), rs.getString(4),
                        rs.getString(5), rs.getString(7));
                list.add(b);

            }
            return list;
        } catch (Exception e) {
        } finally {
            try {
                db.closeConnection(rs, ps, conn);
            } catch (SQLException ex) {
                Logger.getLogger(BlogDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public Blog getOne(int id) {
        try {
            String sql = "SELECT a.*,b.name FROM dbo.blog AS a INNER JOIN dbo.category AS b ON b.id = a.category_id WHERE a.id= ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Blog b = new Blog(rs.getInt(1), rs.getString(2),
                        rs.getDate(3), rs.getString(4),
                        rs.getString(5), rs.getString(7));
                return b;
            }
        } catch (Exception e) {
        
        }
        return null;
    }



    public int getTotal(int category_id) {
        try {
            String sql = "SELECT COUNT(id) AS total FROM dbo.blog WHERE category_id = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, category_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception e) {
        } 
        return 0;
    }

    public ArrayList<Blog> getListBlog(int category_id, int pageIndex, int pageSize) {
        ArrayList<Blog> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM (\n"
                    + "SELECT ROW_NUMBER() OVER (ORDER BY timePost desc) "
                    + "AS rn,* FROM dbo.blog WHERE category_id = ? )"
                    + " AS a WHERE a.rn BETWEEN ?*?-2 AND ?*?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, category_id);
            ps.setInt(2, pageIndex);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageIndex);
            ps.setInt(5, pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Blog(rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6)));
            }

        } catch (Exception e) {
        }
        return list;
    }
}
