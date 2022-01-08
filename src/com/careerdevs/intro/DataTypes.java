package com.careerdevs.intro;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {
        //01 - intro
        int age = 30;
        int temperature = 20;
        System.out.println(age);

        //02 - variables
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);

        //03 - primitive
        byte age2 = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isElligible = false;

        //04 - reference
        byte age3 = 30;
        Date now = new Date();
        System.out.println(now);

        //05 - prim vs reference
        byte x = 1;
        byte y = 1;
        x = 2;
        System.out.println(y);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        //06 - strings
        String message = "Hello World" + "!!";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));
        System.out.println(message.replace("!","*"));
                                //.toLowerCase()
                                //.toUppercase()
                                //.trim()

        //07 - escape sequences
        String message2 = "Hello \"Mosh\"";
        System.out.println(message2);
        String message3 = "c:\\Windows\\...";
        System.out.println(message3);
        String message4 = "c:\nWindows\\...";
        System.out.println(message4);
        String message5 = "c:\tWindows\\...";
        System.out.println(message5);

        //08 - arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));
        int[] numbers2 = {2, 3, 5, 1, 4};
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
    }
}
