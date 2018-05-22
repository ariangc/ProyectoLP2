/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.User;

/**
 *
 * @author alulab14
 */
public class ChangePasswordService extends Service{
    private User currentUser;
    private static ChangePasswordService changePasswordService;
    
    private ChangePasswordService(){}
    public void changeService(Service newService) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static ChangePasswordService getInstance(){
        if(changePasswordService==null){
            changePasswordService= new ChangePasswordService();
        }
        return changePasswordService;
    }

    /**
     * @return the currentUser
     */
    public User getCurrentUser() {
        return currentUser;
    }

    /**
     * @param currentUser the currentUser to set
     */
    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

}
