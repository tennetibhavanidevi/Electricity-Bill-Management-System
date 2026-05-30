package com.electricity;

import java.io.FileWriter;

public class ReceiptGenerator {

    public static void generateReceipt(
            int customerId,
            int units,
            double amount) throws Exception {

        FileWriter fw =
        new FileWriter("receipt_" + customerId + ".txt");

        fw.write("Electricity Bill Receipt\n");
        fw.write("------------------------\n");
        fw.write("Customer ID: " + customerId + "\n");
        fw.write("Units Consumed: " + units + "\n");
        fw.write("Amount: ₹" + amount + "\n");

        fw.close();
    }
}