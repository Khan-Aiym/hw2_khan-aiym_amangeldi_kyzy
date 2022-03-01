package com.company;

import java.util.Random;

public class Main {
    public static String potion = "Можно идти гулять";
    public static String place = "Оставайтесь дома";

    public static void main(String[] args) {
        System.out.println(flower(13, 25));
        System.out.println(flower(7, -14));
        System.out.println(flower(27, 7));
        System.out.println(flower(19, 31));
        System.out.println(flower(63, -2));

        System.out.println(flower(generateRandomAge(), 23));


        // write your code here
    }

    public static String flower(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return potion;
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return potion;
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return potion;
        } else {
            return place;
        }
    }

    public static int generateRandomAge () {
        Random random = new Random();
        int math = random.nextInt(99);
        return math;
    }
}
