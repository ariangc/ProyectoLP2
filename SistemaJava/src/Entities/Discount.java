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
public class Discount implements Entity {
    
    private int clientPointsRequired;
    private String description;
    private int productId;
    private double newPrice;

    public Discount(int clientPointsRequired, String description, int productId, double newPrice) {
        this.clientPointsRequired = clientPointsRequired;
        this.description = description;
        this.productId = productId;
        this.newPrice = newPrice;
    }

    /**
     * @return the clientPointsRequired
     */
    public int getClientPointsRequired() {
        return clientPointsRequired;
    }

    /**
     * @param clientPointsRequired the clientPointsRequired to set
     */
    public void setClientPointsRequired(int clientPointsRequired) {
        this.clientPointsRequired = clientPointsRequired;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the newPrice
     */
    public double getNewPrice() {
        return newPrice;
    }

    /**
     * @param newPrice the newPrice to set
     */
    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }
    
    @Override
    public void addToBD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void updateInBD(){        
        System.out.println("updateInBD ejecutado");
    }
    
    @Override
    public void deleteInBD(){
        System.out.println("deleteInBD ejecutado");        
    }

    
    
}
