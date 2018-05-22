/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author alulab14
 */
public abstract class Transaction implements Entity {

    private String products;
    private Date transactionDate;
    private String productQuantity;
    private Date expirationDate;

    public Transaction(String products, Date transactionDate, String productQuantity, Date expirationDate) {
        this.products = products;
        this.transactionDate = transactionDate;
        this.productQuantity = productQuantity;
        this.expirationDate = expirationDate;
    }

    /**
     * @return the product
     */
    public String getProducts() {
        return products;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String products) {
        this.products = products;
    }

    /**
     * @return the transactionDate
     */
    public Date getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * @return the productQuantity
     */
    public String getProductQuantity() {
        return productQuantity;
    }

    /**
     * @param productQuantity the productQuantity to set
     */
    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    /**
     * @return the expirationDate
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    @Override
    public abstract void addToBD();

    @Override
    public abstract void updateInBD();

    @Override
    public abstract void deleteInBD();
}
