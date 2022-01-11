/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubes.perpus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Unknown
 */
public class connection {

    private static Connection mysqlconfig;

    public static Connection configDB() {
        try {
            String url = "jdbc:mysql://localhost/perpustakaandb";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            System.out.println("Database connected successfully");
            return mysqlconfig;
        } catch (SQLException e) {
            throw new RuntimeException("Database failed to connect", e);
        }
    }
}
