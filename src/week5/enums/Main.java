package week5.enums;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a day: ");

        String input = scanner.next().toUpperCase();

        if (Days.isValidDay(input)){
            Days selectedDay = Days.valueOf(input);
            System.out.println(input + " working hours: " + selectedDay.getStart() + ":00-" + selectedDay.getFinish() + ":00");
        }else {
            System.out.println("You have entered an invalid day!");
        }

        scanner.close();
    }

}
