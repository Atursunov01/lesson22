package com.company;


import java.io.IOException;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args)  {
        Car car = new Car();
        car.close();

        try { Car car1 = new Car();
            car.drive();
        }
        catch (Exception e) {

        }
        finally {
            System.out.println("_____________________");
        }
    }

    }


