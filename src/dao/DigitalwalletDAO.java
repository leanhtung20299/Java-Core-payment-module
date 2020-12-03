/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Digitalwallet;

/**
 *
 * @author PT-LS
 */
public class DigitalwalletDAO {
    public  Digitalwallet searchDigitalWalletbyIDcustomer(int key) {
        Digitalwallet digitalwallet = new Digitalwallet();
        String sql = "SELECT * FROM Digitalwallet WHERE idcustomer = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,key);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
              
                digitalwallet.setIdwallet(rs.getInt("idwallet"));
                digitalwallet.setIdcustomer(rs.getInt("idcustomer"));
                digitalwallet.setIdRank(rs.getInt("idRank"));       
                digitalwallet.setMoneyaccumulated(rs.getFloat("moneyaccumulated"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return digitalwallet;
    }
     public boolean updateDigital(int Key, float thanhtoan) {
        boolean result = false;
        String sql = "update Digitalwallet set moneyaccumulated = ? where idwallet = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, thanhtoan);
            ps.setInt(2, Key);
            ps.executeQuery();
            result = true;
            
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                user.setName(rs.getString("name"));
//                user.setPosition(rs.getString("position"));
//                result = true;
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
