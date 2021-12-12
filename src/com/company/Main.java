package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(5)+1;
        Quadrangles quadrangles = new Quadrangles();
        quadrangles.fillRandom(n);
        System.out.println(quadrangles);
        quadrangles.MinPerimetr();

        n = r.nextInt(5)+1;
        Rhombuses rhombuses = new Rhombuses();
        rhombuses.fillRandom(n);
        System.out.println(rhombuses);
        rhombuses.MediumArea();
    }
}
