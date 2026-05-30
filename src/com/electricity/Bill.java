package com.electricity;

public class Bill {

    public static double calculateBill(int units) {

        if(units <= 100)
            return units * 2.5;

        else if(units <= 300)
            return units * 4;

        else
            return units * 6;
    }
}
