package com.electricity;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerDAO {

    public void addCustomer(Customer c) {

        try {

            Connection con =
            DBConnection.getConnection();

            String sql =
            "INSERT INTO customer(name,address,meter_no,phone) VALUES(?,?,?,?)";

            PreparedStatement ps =
            con.prepareStatement(sql);

            ps.setString(1, c.name);
            ps.setString(2, c.address);
            ps.setString(3, c.meterNo);
            ps.setString(4, c.phone);

            ps.executeUpdate();

            System.out.println("Customer Added Successfully!");

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}