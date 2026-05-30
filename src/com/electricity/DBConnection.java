package com.electricity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection()
            throws Exception {

        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/electricity_bill",
                "root",
                "Karaikal@12");
    }

    public static void main(String[] args) {

        try {

            Connection con = getConnection();

            System.out.println("Connected Successfully!");

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}