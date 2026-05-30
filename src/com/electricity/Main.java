package com.electricity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CustomerDAO customerDAO = new CustomerDAO();
        BillDAO billDAO = new BillDAO();

        while(true) {

            System.out.println("\n===== Electricity Bill Management =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Generate Bill");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();

                    System.out.print("Enter Meter Number: ");
                    String meter = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    Customer customer =
                    new Customer(name,address,meter,phone);

                    customerDAO.addCustomer(customer);

                    break;

                case 2:

                    System.out.print("Enter Customer ID: ");
                    int customerId = sc.nextInt();

                    System.out.print("Enter Units Consumed: ");
                    int units = sc.nextInt();

                    billDAO.generateBill(customerId, units);

                    break;

                case 3:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}
