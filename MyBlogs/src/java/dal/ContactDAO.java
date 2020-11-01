/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import entity.Contact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class ContactDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertContact(Contact c) {
        try {
            String sql = "INSERT INTO dbo.contact\n"
                    + "          ( name, email, phone, company, message )\n"
                    + "  VALUES  (?,\n"
                    + "            ?, \n"
                    + "            ?, \n"
                    + "            ?, \n"
                    + "            ?  \n"
                    + "            )";
            conn = new db.DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setString(2, c.getEmail());
            ps.setString(3, c.getPhoneNumber());
            ps.setString(4, c.getCompany());
            ps.setString(5, c.getMessage());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
        }finally{
            try {
                new db.DBContext().closeConnection(rs, ps, conn);
            } catch (SQLException ex) {
                Logger.getLogger(ContactDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
}
