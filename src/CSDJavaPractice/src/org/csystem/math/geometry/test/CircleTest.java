package org.csystem.math.geometry.test;

import org.csystem.math.geometry.Circle;

import java.util.Scanner;
import java.util.Random;

class CircleTest {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of Circle instances to create: ");
        int n = kb.nextInt();

        while (n-- > 0) {
            System.out.println("----------");

            double r = random.nextDouble(-10, 11);
            System.out.printf("Random generated value: %f%n", r);

            Circle c = new Circle(r);
            System.out.println("New Circle instance created");
            System.out.printf("Radius = %f, Area = %f, Circumference = %f%n", c.getRadius(), c.getArea(), c.getCircumference());

            r = random.nextDouble(-10, 11);
            System.out.printf("Random generated value: %f%n", r);

            c.setRadius(r);
            System.out.printf("Radius = %f, Area = %f, Circumference = %f%n", c.getRadius(), c.getArea(), c.getCircumference());

            System.out.println("----------");
        }
    }
}
