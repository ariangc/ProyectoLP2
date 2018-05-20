/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Entities;

/**
 *
 * @author alulab14
 */
public class Client implements Entity {
    private int id;
    private String name;
    private int points;
    private String address;
    private int phoneNumber;


    public Client(int id, String name, int points, String address, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.points = points;
        this.address = address;
        this.phoneNumber = phoneNumber;
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
    public void addToBD(){
        System.out.println("Agregando a la BD -> Cliente");
    }

    @Override
    public void updateInBD(){
        System.out.println("Actualizando la BD -> Cliente");
    }

    @Override
    public void deleteInBD(){
        System.out.println("Eliminando de la BD -> Cliente");
    }
    
}
