/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Entities;

import java.util.Date;

/**
 *
 * @author alulab14
 */
public abstract class Transaction implements Entity {

    private Product product;
    private Date transactionDate;
    private int productQuantity;
    private Date expirationDate;

    public Transaction(Product product, Date transactionDate, int productQuantity, Date expirationDate) {
        this.product = product;
        this.transactionDate = transactionDate;
        this.productQuantity = productQuantity;
        this.expirationDate = expirationDate;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
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
    public int getProductQuantity() {
        return productQuantity;
    }

    /**
     * @param productQuantity the productQuantity to set
     */
    public void setProductQuantity(int productQuantity) {
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
