/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStorage;

import Entities.Entity;
import Utils.Constants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alulab14
 */
public class BDManager {

    private static BDManager dataBase;
    private static Connection con;
    private static PreparedStatement st;

    private BDManager() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //registrar driver
        } catch (Exception ex) {
            System.out.println("Error en la conexión a la base de datos");
        }
    }

    public static BDManager getInstance() {
        if (dataBase == null) {
            dataBase = new BDManager();
        }
        return dataBase;
    }

    public void setProcedure(String procedureName) {
        try {
            con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            PreparedStatement st = con.prepareStatement(procedureName);
        } catch (SQLException ex) {
            System.out.println("Error al definir el procedimiento");
        }
    }

    public void setParameters(ArrayList parameters) {
        try {
            for (int i = 0; i < parameters.size(); i++) {
                Object parameter = parameters.get(i);
                if (parameters.get(i) instanceof String) {
                    String p = (String) parameter;
                    st.setString(i, p);
                } else if (parameters.get(i) instanceof Integer) {
                    Integer p = (Integer) parameter;
                    st.setInt(i, p);
                } else if (parameters.get(i) instanceof Double) {
                    Double p = (Double) parameter;
                    st.setDouble(i, p);
                }
            }
        } catch (Exception ex) {
            System.out.println("Error al definir parametros");
        }
    }

    public void updateBD(String procedureName, ArrayList parameters) {
        try {
            setProcedure(procedureName);
            setParameters(parameters);
            st.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BDManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public ArrayList<String> getParameters(String procedureName) {
//        ArrayList<String> list = new ArrayList<>();
//        ArrayList<String> parameters = new ArrayList<>();
//        parameters.add(procedureName);
//        setProcedure(Constants.getParametersProcedure);
//        setParameters(parameters);
//        try {
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                list.add(rs.getString("PARAMETER_NAME"));
//            }
//            con.close();
//        } catch (Exception ex) {
//            System.out.println("Error al buscar los parametros");
//        }
//        return list;
//    }

    public ArrayList selectBD(String procedureName, ArrayList parameters, String tag) {
        ArrayList<Entity> list = null;
        try {
            setProcedure(procedureName);
            setParameters(parameters);
            list = getValues(tag, paramList);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BDManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Entity> getValues(String tag, ArrayList<String> paramList) {
        ArrayList<Entity> list = new ArrayList<>();
        switch (tag) {
            case "DISCOUNT":
                list = getDiscounts(paramList);
                break;
            case "PRODUCT":
                list = getProducts(paramList);
                break;
            case "SUPPLIER":
                list = getSuppliers(paramList);
                break;
            case "USER":
                list = getUsers(paramList);
                break;
            case "SALES":
                list = getSales(paramList);
                break;
        }
        return list;
    }

    private ArrayList<Entity> getDiscounts(ArrayList<String> paramList) {
        try {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("IdDiscount");
                int points = rs.getInt("ClientPointsRequired");
                String description = rs.getString("Description");
                int productId = rs.getInt("Product_IdProduct");
                double factor = rs.getDouble("Factor");
                int state = rs.getInt("State");
            }
        } catch (Exception ex) {
            System.out.println("Error al obtener descuentos");
        }
    }

    private ArrayList<Entity> getProducts(ArrayList<String> paramList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Entity> getSuppliers(ArrayList<String> paramList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Entity> getUsers(ArrayList<String> paramList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Entity> getSales(ArrayList<String> paramList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
