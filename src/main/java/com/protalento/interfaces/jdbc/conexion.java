package com.protalento.interfaces.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class conexion {


    public static Connection getConnexion() {
        Connection connexion = null;
        String db_driver = "org.mariadb.jdbc.Driver";
        String db_url = "jdbc:mariadb://localhost:3306/datosbusqueda";
        String db_user = "root";
        String db_clave = "";


        try {
            Class.forName(db_driver);
            connexion = DriverManager.getConnection(db_url,db_user,db_clave);
        } catch (SQLException  e) {
            System.out.println(e);;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



        return connexion;
    }





}
