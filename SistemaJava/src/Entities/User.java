/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Java.Utils.Enumerators.UserType;

/**
 *
 * @author alulab14
 */
//public enum UserType{Administrador,Usuario}
public class User implements Entity {

    private String email;
    private String password;
    private String fullName;
    private int id;
    private int phoneNumber;
    private UserType type;
    private Boolean changePassword;

    public User(String email, String password, String fullName, int id, int phoneNumber, UserType type, Boolean changePassword) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.changePassword = changePassword;
    }    

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    /**
     * @return the type
     */
    public UserType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(UserType type) {
        this.type = type;
    }

    /**
     * @return the changePassword
     */
    public Boolean getChangePassword() {
        return changePassword;
    }

    /**
     * @param changePassword the changePassword to set
     */
    public void setChangePassword(Boolean changePassword) {
        this.changePassword = changePassword;
    }
    
    public User checkPassword() {
        return null;
    }
    
    public void changePassword(String oldPassword, String newPassword) {
        
    }
    
    
    @Override
    public void addToBD() {
        System.out.println("Agregando a la BD -> Usuario");
    }

    @Override
    public void updateInBD() {
        System.out.println("Actualizando la BD -> Usuario");
    }

    @Override
    public void deleteInBD() {
        System.out.println("Eliminando de la BD -> Usuario");
    }

    
    
}
