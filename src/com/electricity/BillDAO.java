package com.electricity;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class BillDAO {

    public void generateBill(int customerId, int units) {

        try {

            double amount = Bill.calculateBill(units);

            Connection con = DBConnection.getConnection();

            String sql =
            "INSERT INTO bill(customer_id,units,amount,bill_date) VALUES(?,?,?,?)";

            PreparedStatement ps =
            con.prepareStatement(sql);

            ps.setInt(1, customerId);
            ps.setInt(2, units);
            ps.setDouble(3, amount);
            ps.setDate(4, Date.valueOf(LocalDate.now()));

            ps.executeUpdate();

            System.out.println("Bill Generated Successfully!");
            System.out.println("Amount = ₹" + amount);

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}