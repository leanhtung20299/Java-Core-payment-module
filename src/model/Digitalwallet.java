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
public class Digitalwallet {
    private int idwallet ;
    private int idcustomer;
    private int idRank;
    private float moneyaccumulated;

    public Digitalwallet() {
    }

    public Digitalwallet(int idwallet, int idcustomer, int idRank, float moneyaccumulated) {
        this.idwallet = idwallet;
        this.idcustomer = idcustomer;
        this.idRank = idRank;
        this.moneyaccumulated = moneyaccumulated;
    }

    public int getIdwallet() {
        return idwallet;
    }

    public void setIdwallet(int idwallet) {
        this.idwallet = idwallet;
    }

    public int getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(int idcustomer) {
        this.idcustomer = idcustomer;
    }

    public int getIdRank() {
        return idRank;
    }

    public void setIdRank(int idRank) {
        this.idRank = idRank;
    }

    public float getMoneyaccumulated() {
        return moneyaccumulated;
    }

    public void setMoneyaccumulated(float moneyaccumulated) {
        this.moneyaccumulated = moneyaccumulated;
    }
    
}
