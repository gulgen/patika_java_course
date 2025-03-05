package ArihtmeticOperations;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Birinci sayıyı girin:");
        int a = scanner.nextInt();

        System.out.println("İkinci sayıyı girin:");
        int b = scanner.nextInt();

        System.out.println("Üçüncü sayıyı girin:");
        int c = scanner.nextInt();

        int sonuc = (a + b) * (c - b);
        System.out.println("Sonuç:" + sonuc);

        scanner.close();
    }
}
