package week2;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int age = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number = scanner.nextInt();
        int divisor = number / 2;

        boolean result = isPrime(number, divisor);
        if (result) {
            System.out.println(number + " sayısı ASALDIR!");
        } else {
            System.out.println(number + " sayısı ASAL değildir!");
        }

    }

    private static boolean isPrime(int number, int divisor) {
        //2den küçük sayılar asal değil
        if (number < 2) return false;
        //Bölünecek sayı kalmadıysa asaldır
        if (divisor == 1) return true;
        //Sayı kendisi hariç bir sayıya tam bölünüyorsa asal değil
        if (number % divisor == 0) return false;
        return isPrime(number, divisor - 1);

    }

}
