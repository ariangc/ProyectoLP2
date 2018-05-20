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
public class SupplierOrder extends Transaction {

    private Supplier supplier;
    private int stock;
    private int boxSize;

    public SupplierOrder(Supplier supplier, int stock, int boxSize, Product product, Date transactionDate, int productQuantity, Date expirationDate) {
        super(product, transactionDate, productQuantity, expirationDate);
        this.supplier = supplier;
        this.stock = stock;
        this.boxSize = boxSize;
    }

    /**
     * @return the supplier
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * @param supplier the supplier to set
     */
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
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

    private void maxStockWarning() {

    }

    @Override
    public void addToBD() {

    }

    @Override
    public void updateInBD() {

    }

    @Override
    public void deleteInBD() {

    }
}
