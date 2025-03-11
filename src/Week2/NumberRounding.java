package Week2;

import java.util.Scanner;

public class NumberRounding {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ondalıklı sayı girin: ");
        double sayi = scanner.nextDouble();

        // Sayıyı aşağı, yukarı ve en yakına yuvarla, yazdır
        int asagiYuvarlama = (int) Math.floor(sayi);
        System.out.println("Aşağı yuvarlama: " + asagiYuvarlama);

        int yukariYuvarlama = (int) Math.ceil(sayi);
        System.out.println("Yukarı yuvarlama: " + yukariYuvarlama);

        int enYakinaYuvarlama = (int) Math.round(sayi);
        System.out.println("En yakın tam sayı: " + enYakinaYuvarlama);


    }
}


