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
public class InfoUsedService {
    private int idInfo;
    private Date Bookingdate;
    private Date expirydate;
    private Date dateused;
    private String note;
    private Booking booking;
    private Staff staff;
    private Customer customer;
    private User user;

    public InfoUsedService() {
    }

    public InfoUsedService(int idInfo, Date Bookingdate, Date expirydate, Date dateused, String note, Booking booking, Staff staff, Customer customer, User user) {
        this.idInfo = idInfo;
        this.Bookingdate = Bookingdate;
        this.expirydate = expirydate;
        this.dateused = dateused;
        this.note = note;
        this.booking = booking;
        this.staff = staff;
        this.customer = customer;
        this.user = user;
    }

    public int getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(int idInfo) {
        this.idInfo = idInfo;
    }

    public Date getBookingdate() {
        return Bookingdate;
    }

    public void setBookingdate(Date Bookingdate) {
        this.Bookingdate = Bookingdate;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    public Date getDateused() {
        return dateused;
    }

    public void setDateused(Date dateused) {
        this.dateused = dateused;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
