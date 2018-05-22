/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author alulab14
 */
public class AdminService extends UserService {
    private static AdminService adminService;

    private AdminService(){
    }

    public static AdminService getInstance(){
        if(adminService==null){
            adminService= new AdminService();
        }
        return adminService;
    }

    public void createReport(){

    }

    public void clickButtonUploadExcel(){

    }

    public void requestBackup(){

    }

}
