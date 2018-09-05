package com.company;

/**
 * Created by Daniel_D'AGE on 05.09.2018.
 */
public class HardLevelTask3 {
    public static void main(String[] args) {
        int a =4;
        int b =17;
        int score=0;

        int ceil = (int)Math.ceil(Math.sqrt(a));

        int floor = (int)Math.sqrt(b);

        System.out.println(floor-ceil+1);

        }

    }

