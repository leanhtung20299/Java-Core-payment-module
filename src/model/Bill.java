/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author PT-LS
 */
public class Bill {

    private int idbill;
    private InfoUsedService idInfo;
    private Date paymentDate;
    private float amount;
    private String paymentType;
    private String note; 
            

    public Bill() {
    }

    public Bill(int idbill, InfoUsedService idInfo, Date paymentDate, float amount, String paymentType, String note) {
        this.idbill = idbill;
        this.idInfo = idInfo;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.paymentType = paymentType;
        this.note = note;
    }

    public int getIdbill() {
        return idbill;
    }

    public void setIdbill(int idbill) {
        this.idbill = idbill;
    }

    public InfoUsedService getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(InfoUsedService idInfo) {
        this.idInfo = idInfo;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
