/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PT-LS
 */
public class Booking {
    private int idBooking;
    private float paymentprice;
    private float totalprice;
    private Service service;

    public Booking() {
    }

    public Booking(int idBooking, float paymentprice, float totalprice, Service service) {
        this.idBooking = idBooking;
        this.paymentprice = paymentprice;
        this.totalprice = totalprice;
        this.service = service;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public float getPaymentprice() {
        return paymentprice;
    }

    public void setPaymentprice(float paymentprice) {
        this.paymentprice = paymentprice;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
    
    
}
