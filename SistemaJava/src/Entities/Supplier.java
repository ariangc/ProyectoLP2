/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
/**
 *
 * @author alulab14
 */
public class Supplier implements Entity {
    
    private int id;
    private int phoneNumber;
    private String name;
    private String address;
    private String products;
    
    public Supplier(int id, int phoneNumber, String name, String address, String products) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.products = products;
    }
    
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void addToBD() {
        System.out.println("addToBD ejecutado");
    }
    
    @Override
    public void updateInBD(){        
        System.out.println("updateInBD ejecutado");
    }
    
    @Override
    public void deleteInBD(){
        System.out.println("deleteInBD ejecutado");        
    }  int getId() {
        return id;
    }

    /**
     * @return the products
     */
    public String getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(String products) {
        this.products = products;
    }
    
}
