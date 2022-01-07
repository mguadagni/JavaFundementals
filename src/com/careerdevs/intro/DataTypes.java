package com.careerdevs.intro;

import java.awt.*;
import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {
        //01
        int age = 30;
        int temperature = 20;
        System.out.println(age);

        //02
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);

        //03
        byte age2 = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isElligible = false;

        //04
        byte age3 = 30;
        Date now = new Date();
        System.out.println(now);

        //05
        byte x = 1;
        byte y = 1;
        x = 2;
        System.out.println(y);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        //06
        String message = "Hello World" + "!!";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));
        System.out.println(message.replace("!","*"));
                                //.toLowerCase()
                                //.toUppercase()
                                //.trim()

        //07
    }
}
