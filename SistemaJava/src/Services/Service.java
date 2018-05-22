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
public abstract class Service {
	private User activeUser;

    /**
     * @return the activeUser
     */
    public User getActiveUser() {
        return activeUser;
    }

    /**
     * @param activeUser the activeUser to set
     */
    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }
}
