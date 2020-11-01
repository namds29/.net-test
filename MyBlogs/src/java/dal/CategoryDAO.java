/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import entity.Category;
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
public class CategoryDAO {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    public ArrayList<Category> getCategories(){
        ArrayList<Category> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dbo.category";
            conn = new db.DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Category cate = new Category(rs.getInt(1), rs.getString(2));
                list.add(cate);
            }
            
        } catch (Exception e) {
        }
        return list;
    }
    public Category getOne(int id){
        try {
            String sql = "SELECT * FROM dbo.category WHERE id = ?";
            conn = new db.DBContext().getConnection();
            ps =   conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                return new Category(rs.getInt(1), rs.getString(2));
            }
        }catch(Exception e)
        {
            
        }finally{
            try {
                new db.DBContext().closeConnection(rs, ps, conn);
            } catch (SQLException ex) {
                Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
        return null;
    }
}
