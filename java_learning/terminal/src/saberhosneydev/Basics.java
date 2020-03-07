package saberhosneydev;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Basics {
    //Define a global variable
    public static Scanner scanner = new Scanner(System.in);


    public static void printNumbers() {
        System.out.println("Enter the MAX variable for forStatement");

        Integer max = scanner.nextInt();
        for (int i = 0; i <= max; ++i) {
            System.out.println(i);
        }

    }

    public static void calculateAge(String name) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1999, Month.DECEMBER, 8);
        Period p = Period.between(birthday, today);
        System.out.println("Welcome " + name + ", Your age is " + p.getYears());
        System.out.println("Your age in detail is : " + p.getYears() + "Years, " + p.getMonths() + "Months, " + p.getDays() + "Days.");
    }

    public static void statements() {
        while (true) {
            String input = scanner.next();
            if ("next".equals(input)) {
                break;
            }
        }

    }
}
