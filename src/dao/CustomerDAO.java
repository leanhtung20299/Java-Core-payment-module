/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.security.ntlm.Client;
import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author PT-LS
 */
public class CustomerDAO {

    public ArrayList<Customer> searchCustomer(String key) {
        ArrayList<Customer> result = new ArrayList<Customer>();
        String sql = "SELECT * FROM tblCustomer WHERE name LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getInt("idcustomer"));
                customer.setName(rs.getString("name"));
                customer.setAddress(rs.getString("address"));
                customer.setPhone(rs.getString("phone"));
                customer.setEmail(rs.getString("email"));
                customer.setNote(rs.getString("note"));
                result.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
     public Customer searchCustomerbyID(int key) {
        Customer customer = new Customer();
        String sql = "SELECT * FROM tblCustomer WHERE idcustomer = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,key);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
              
                customer.setId(rs.getInt("idcustomer"));
                customer.setName(rs.getString("name"));
                customer.setAddress(rs.getString("address"));
                customer.setPhone(rs.getString("phone"));
                customer.setEmail(rs.getString("email"));
                customer.setNote(rs.getString("note"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customer;
    }
    
}
