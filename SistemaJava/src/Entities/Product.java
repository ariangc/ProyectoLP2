/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Entities;

import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public class Product implements Entity {
    private int id;
    private String name;
    private ArrayList<String> components = new ArrayList<>();
    private double price;
    private boolean needsPrescription;
    private double utility;
    private int points;

    public Product(int id, String name, double price, boolean needsPrescription, double utility, int points) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.needsPrescription = needsPrescription;
        this.utility = utility;
        this.points = points;
    }
 
    public Product(int id, String name, ArrayList<String> components, double price, boolean needsPrescription, double utility, int points) {
        this.id = id;
        this.name = name;
        this.components = components;
        this.price = price;
        this.needsPrescription = needsPrescription;
        this.utility = utility;
        this.points = points;
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
     * @return the components
     */
    public ArrayList<String> getComponents() {
        return components;
    }

    /**
     * @param components the components to set
     */
    public void setComponents(ArrayList<String> components) {
        this.components = components;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the needsPrescription
     */
    public boolean isNeedsPrescription() {
        return needsPrescription;
    }

    /**
     * @param needsPrescription the needsPrescription to set
     */
    public void setNeedsPrescription(boolean needsPrescription) {
        this.needsPrescription = needsPrescription;
    }

    /**
     * @return the utility
     */
    public double getUtility() {
        return utility;
    }

    /**
     * @param utility the utility to set
     */
    public void setUtility(double utility) {
        this.utility = utility;
    }

    /**
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
    }
    
    @Override
    public void addToBD(){
            System.out.println("Agregando a la BD -> Producto");
    }

    @Override
    public void updateInBD(){
            System.out.println("Actualizando la BD -> Producto");
    }

    @Override
    public void deleteInBD(){
            System.out.println("Eliminando de la BD -> Producto");
    }
    
    public void addComponent(String componentName) {
        components.add(componentName);
    }
    
}
