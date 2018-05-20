/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Entities;

import Java.Utils.Enumerators.RequirementType;

/**
 *
 * @author alulab14
 */
public class Requirement implements Entity {
    
    private String description;
    private RequirementType type;

    public Requirement(String description, RequirementType type) {
        this.description = description;
        this.type = type;
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
    
    public RequirementType getType(){
        return type;
    }
    
    public void setType(RequirementType type){
        this.type = type;
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

    
}
