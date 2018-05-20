/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.DataStorage;

import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public class BDManager {
    private static BDManager dataBase;
    
    private BDManager() {
        
    }
    
    public static BDManager getInstance() {
        if (dataBase == null) {
            dataBase = new BDManager();
        }
        return dataBase;
    }
    
    public void setProcedure(String procedureName) {
        System.out.println("Setting procedure " + procedureName + "...");    
    }
    
    public void setParameters(ArrayList parameters) {
        for (Object parameter : parameters) {
            System.out.println("Setting parameter " + parameter + "...");
        }
    }
    
    public ArrayList<String> executeProcedure() {
        System.out.println("Executing..."); 
        return null;
    }
    
    
}
