package Practices;

import java.util.Scanner;

public class userinputexample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String name = scanner.next();

        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.print("Merhaba " + name + "," + age + " yaşındasın.");

        scanner.close();

    }
}
