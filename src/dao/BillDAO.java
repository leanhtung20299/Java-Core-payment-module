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
import model.Bill;
import model.InfoUsedService;

/**
 *
 * @author PT-LS
 */
public class BillDAO {

    public ArrayList<Bill> searchBillByIdCustomer(int Key) {
        ArrayList<Bill> arrayList = new ArrayList<Bill>();
        String sql = "select * from tblBill inner join tblInfoUsedService on tblBill.idInfo = tblInfoUsedService.idInfo inner join tblCustomer on tblCustomer.idcustomer = tblInfoUsedService.idcustomer where tblInfoUsedService.idcustomer = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Key);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setIdbill(rs.getInt("idbill"));
                bill.setAmount(rs.getFloat("amount"));
                bill.setNote(rs.getString("note"));
                bill.setPaymentDate(rs.getDate("paymentDate"));
                bill.setPaymentType(rs.getString("paymentType"));
                arrayList.add(bill);
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<Bill> selectallbill() {
        ArrayList<Bill> arrayList = new ArrayList<Bill>();
        String sql = "select * from tblBill";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setIdbill(rs.getInt("idbill"));
                bill.setAmount(rs.getFloat("amount"));
                bill.setNote(rs.getString("note"));
                bill.setPaymentDate(rs.getDate("paymentDate"));
                bill.setPaymentType(rs.getString("paymentType"));
                arrayList.add(bill);
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean updateBill(int Key, String thanhtoan) {
        boolean result = false;
        String sql = "update tblBill set paymentType = ? where idInfo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, thanhtoan);
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
