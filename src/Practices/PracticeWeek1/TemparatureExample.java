package Practices.PracticeWeek1;

import java.util.Scanner;

public class TemparatureExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Celcius cinsinden sıcaklık girin: ");
        double celcius = scanner.nextDouble();

        // F = (C * 1.8) + 32
        double f = (celcius * 1.8) + 32;
        System.out.println("C -> F :" + f);
    }
}
