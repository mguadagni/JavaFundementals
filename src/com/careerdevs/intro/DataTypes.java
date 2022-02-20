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

        //09 - Multi-dimensional Arrays
        int[][] numbers3 = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers3));

        //10 - constants
        final float PI = 3.14F; //cannot reassign variable

        //11 - arithmetic expressions
        double result = (double)10 / (double)3;
        System.out.println(result);

        //12 - order of operations
        int x2 = 10 + 3 * 2;
        System.out.println(x2);

        int x3 = (10 + 3) * 2;
        System.out.println(x3);

        //13 - casting
        short x4 = 1;
        int y2 = x4 + 2;
        System.out.println(y2);

        double x5 = 1.1;
        double y3 = x5 + 2;
        System.out.println(y3);

        double x6 = 1.1;
        int y4 = (int)x6 + 2;
        System.out.println(y4);

        String x7 = "1";
        int y5 = Integer.parseInt(x7) + 2;
        System.out.println(y5);

        //14 - the math class
        int result2 = Math.round(1.1F);
        System.out.println(result2);

        int result3 = (int)Math.ceil(1.1F);
        System.out.println(result3);

        int result4 = (int)Math.floor(1.1F);
        System.out.println(result4);

        int result5 = Math.max(1, 2);
        System.out.println(result5);

        int result6 = (int) Math.round(Math.random() * 100);
        System.out.println(result6);

    }
}
