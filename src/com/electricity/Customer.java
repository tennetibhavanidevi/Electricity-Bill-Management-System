package com.electricity;

public class Customer {

    int id;
    String name;
    String address;
    String meterNo;
    String phone;

    public Customer(String name,
                    String address,
                    String meterNo,
                    String phone) {

        this.name = name;
        this.address = address;
        this.meterNo = meterNo;
        this.phone = phone;
    }
}
