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
public class SupplierOrder extends Transaction {
    private int id;
    private Supplier supplier;
    private ArrayList<Package> packages;

    public SupplierOrder(int id, Supplier supplier, String products, Date transactionDate, String productQuantity, Date expirationDate) {
        super(products, transactionDate, productQuantity, expirationDate);
        this.id = id;
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
