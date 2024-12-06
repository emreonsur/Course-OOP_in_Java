package org.csystem.math.test;

import org.csystem.math.Complex;

import java.util.Scanner;
import java.util.Random;

class ComplexTest {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of tests: ");
        int n = kb.nextInt();

        while (n-- > 0) {
            System.out.println("----------");

            Complex c1 = new Complex();
            System.out.println("New Complex instance created with the ctor Complex()");
            System.out.println(c1.toString());

            Complex c2 = new Complex(random.nextDouble(-10, 11));
            System.out.println("New Complex instance created with the ctor Complex(double)");
            System.out.println(c2.toString());

            Complex c3 = new Complex(random.nextDouble(-10, 11), random.nextDouble(-10, 11));
            System.out.println("New Complex instance created with the ctor Complex(double, double)");
            System.out.println(c3.toString());

            double randomValue = random.nextDouble(-10, 11);

            System.out.printf("%s + %f = %s%n", c3.toString(), randomValue, c3.add(randomValue));
            System.out.printf("%s + %s = %s%n", c2.toString(), c3.toString(), c2.add(c3));
            System.out.printf("%s + %s = %s%n", c3.toString(), c3.toString(), c3.add(c3));

            System.out.printf("c1 = %s%n", c1.toString());
            c1.inc(2.5);
            System.out.printf("c1.inc(2.5) = %s%n", c1.toString());
            c1.inc();
            System.out.printf("c1.inc() = %s%n", c1.toString());
            c1.dec(2.5);
            System.out.printf("c1.dec(2.5) = %s%n", c1.toString());
            c1.dec();
            System.out.printf("c1.dec() = %s%n", c1.toString());

            System.out.println("----------");
        }
    }
}
