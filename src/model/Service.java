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
public class Service {
    private int idService;
    private String name;
    private float price;
    private String note;
    private Material material;
    private Equipment equipment;

    public Service() {
    }

    public Service(int idService, String name, float price, String note, Material material, Equipment equipment) {
        this.idService = idService;
        this.name = name;
        this.price = price;
        this.note = note;
        this.material = material;
        this.equipment = equipment;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
    
    
}
