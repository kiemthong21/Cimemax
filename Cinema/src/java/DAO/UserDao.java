/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author Admin
 */
public class UserDao extends DBContext {

    MD5 md5 = new MD5();

    public User findUser(String email) {
        try {
            String sql = "select * from [User] where [Email] = ? ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                User s = new User();
                s.setId(rs.getInt("user_id"));
                s.setFullname(rs.getString("fullName"));
                s.setEmail(rs.getString("Email"));
                s.setPassword(rs.getString("Password"));
                s.setGender(rs.getBoolean("Gender"));
                s.setPhone(rs.getString("Phone"));
                s.setAvatar(rs.getString("Avatar"));
                s.setAddress(rs.getString("Address"));
                s.setRole(rs.getInt("role"));
                s.setDOB(rs.getDate("DOB"));
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public User findUser(String email, String password) {
        try {
            String sql = "select * from [User] where [Email] = ? and [Password] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            stm.setString(2, md5.getMd5(password));
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                User s = new User();
                s.setId(rs.getInt("user_id"));
                s.setFullname(rs.getString("fullName"));
                s.setEmail(rs.getString("Email"));
                s.setPassword(rs.getString("Password"));
                s.setGender(rs.getBoolean("Gender"));
                s.setPhone(rs.getString("Phone"));
                s.setAvatar(rs.getString("Avatar"));
                s.setAddress(rs.getString("Address"));
                s.setRole(rs.getInt("role"));
                s.setDOB(rs.getDate("DOB"));
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int register(int id, String fullname, String email, String password,
            boolean gender, String phone, String address, int role,
            String avatar, Date DOB) {
        return 1;
    }

    public static void main(String[] args) {
        UserDao us = new UserDao();
        System.out.println(us.findUser("test1@gmail.com", "123"));
    }
}
