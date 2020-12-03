/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.InfoUsedService;

/**
 *
 * @author PT-LS
 */
public class infoUsedServiceDAO {
        public ArrayList<Integer> searchUsedServiceByIdCustomer(int value) {
        String sql = "select * from tblInfoUsedService where idcustomer = ? ";
        ArrayList<Integer> list1 = null;     
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,value);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {           
                Integer list2 = rs.getInt("idInfo");
                list1.add(list2);
            }
            return list1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
