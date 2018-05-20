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
public class Sale extends Transaction {

    public Sale(Product product, Date transactionDate, int productQuantity, Date expirationDate) {
        super(product, transactionDate, productQuantity, expirationDate);
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

    private void consultSimilarProducts() {

    }

    private void consultDiscounts() {

    }

    private void lowStockWarning() {

    }

    private void needsPrescriptionWarning() {

    }
}
