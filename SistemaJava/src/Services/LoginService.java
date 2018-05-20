/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Services;

/**
 *
 * @author alulab14
 */
public class LoginService {

    private static LoginService loginService;

    private LoginService() {
    }

    public void login(int userId, String password) {
        //Gets real password from userID
        //Compares password correctness
        //If so, establishes connection
    }

    public static LoginService getInstance() {
        if (loginService == null) {
            loginService = new LoginService();
        }
        return loginService;
    }
}
