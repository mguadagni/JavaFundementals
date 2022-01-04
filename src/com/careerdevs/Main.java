package com.careerdevs;

import java.awt.*;
import java.util.Date;  //(For reference variable)

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //primitive
        byte age = 30;
        long viewsCounts = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        //reference
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = "Hello World" + "!!";
        System.out.println(message.startsWith("!!"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!","*"));

        String greeting = "Hello \"Mike\"";
        System.out.println(greeting);

        //02-07
    }
}
