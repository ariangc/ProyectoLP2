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
    
    private int id;
    private int clientPointsRequired;
    private String description;
    private int productId;
    private double factor;
    private int state;

    public Discount(int id, int clientPointsRequired, String description, int productId, double factor, int state) {
        this.id = id;
        this.clientPointsRequired = clientPointsRequired;
        this.description = description;
        this.productId = productId;
        this.factor = factor;
        this.state = state;
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the factor
     */
    public double getFactor() {
        return factor;
    }

    /**
     * @param factor the factor to set
     */
    public void setFactor(double factor) {
        this.factor = factor;
    }

    /**
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }

    
    
}
