package Week1;

import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Kullanıcıdan tamsayı ve ondalıklı sayı al
        System.out.println("Bir tamsayı giriniz: ");
        int integer = scanner.nextInt();

        System.out.println("Bir ondalıklı sayı giriniz:");
        double decimalNumber = scanner.nextDouble();
        //tip dönüşümü yap
        double doubleInteger = integer;
        int intDecimalNumber = (int) decimalNumber;
        //Sonuçları yazdır
        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürme: " + doubleInteger);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürme: " + intDecimalNumber);
    }
}
