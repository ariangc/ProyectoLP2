/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import DataStorage.BDManager;
import Utils.Constants;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Package implements Entity {
    private int id;
    private int supplierId;
    private int productId;
    private int expirationDate;   
    private int quantity;
    private int boxSize;

    public Package(int id, int supplierId, int productId, int expirationDate, int quantity, int boxSize) {
        this.id = id;
        this.supplierId = supplierId;
        this.productId = productId;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
        this.boxSize = boxSize;
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
     * @return the supplierId
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
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
     * @return the expirationDate
     */
    public int getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the boxSize
     */
    public int getBoxSize() {
        return boxSize;
    }

    /**
     * @param boxSize the boxSize to set
     */
    public void setBoxSize(int boxSize) {
        this.boxSize = boxSize;
    }
    
    public void mixStockWarning() {
        
    }
    
    @Override
    public void addToBD() {
        BDManager bd = BDManager.getInstance();
        ArrayList parameters = new ArrayList<>();
        parameters.add(id);
        parameters.add(supplierId);
        parameters.add(productId);
        parameters.add(expirationDate);
        parameters.add(quantity);
        parameters.add(boxSize);
        bd.updateBD(Constants.addPackageProcedure, parameters);
    }
    
    @Override
    public void updateInBD() {
        BDManager bd = BDManager.getInstance();
        ArrayList parameters = new ArrayList<>();
        parameters.add(id);
        parameters.add(supplierId);
        parameters.add(productId);
        parameters.add(expirationDate);
        parameters.add(quantity);
        parameters.add(boxSize);
        bd.updateBD(Constants.modifyPackageProcedure, parameters);
    }
    
    @Override
    public void deleteInBD() {
        BDManager bd = BDManager.getInstance();
        ArrayList parameters = new ArrayList<>();
        parameters.add(id);
        bd.updateBD(Constants.deletePackageProcedure, parameters);
    }
}
