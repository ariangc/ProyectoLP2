/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import Entities.*;

/**
 *
 * @author alulab14
 */
public class UserService extends Service {
    private User currentUser;
    private static UserService userService;

    protected UserService(){
    }

    public void addEntity(Entity ent){
        ent.addToBD(); //Does it really have parameters?
    }

    public void updateEntity(Entity ent){
        ent.updateInBD();
    }

    public void deleteEntity(Entity ent){
        ent.deleteInBD();
    }

    public void addTransaction(Transaction trn){
        trn.addToBD();
    }

    public void logOut(){
        //Closes connection?
    }

    public void search(){
        //Searches what?
    }

    public static UserService getInstance(){
        if(userService==null){
            userService = new UserService();
        }
        return userService;
    }

   public void changeService(Service newService) {
		
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
