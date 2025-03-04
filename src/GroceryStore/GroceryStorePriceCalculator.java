package GroceryStore;

import java.util.Scanner;

public class GroceryStorePriceCalculator {

    public static void main(String[] args) {

        //Kullanıcıdan veri almak için scanner oluştur
        Scanner scanner = new Scanner(System.in);
        //Kullamıcıdan armut kg al
        double pearKG = 2.14;
        //Kullanıcıdan elma kg al
        double appleKG = 3.67;
        //Kullanıcıdan domates kg al
        double tomatoKG = 1.11;
        //Kullanıcıdan muz kg al
        double bananaKG = 0.95;
        //Kullanıcıdan patlıcan kg al
        double aubergineKG = 5.00;

        //Armut fiyatını hesapla
        System.out.println("Armut Kaç Kilo ?");
        double pearInput = scanner.nextDouble();

        //ELma fiyatını hesapla
        System.out.println("Elma Kaç Kilo ?");
        double appleInput = scanner.nextDouble();

        //Domates fiyatını hesapla
        System.out.println("Domates Kaç Kilo ?");
        double tomatoInput = scanner.nextDouble();

        //Muz fiyatını hesapla
        System.out.println("Muz Kaç Kilo ?");
        double bananaInput = scanner.nextDouble();

        //Patlıcan fiyatını hesapla
        System.out.println("Patlıcan Kaç Kilo ?");
        double aubergineInput = scanner.nextDouble();

        //Toplam tutarı hesapla
        double totalPrice = pearKG * pearInput + appleKG * appleInput + tomatoKG * tomatoInput + bananaKG * bananaInput + aubergineKG * aubergineInput;

        //Toplam tutarı ekrana yazdır
        System.out.println("Toplam Tutar :" + totalPrice + "TL");

        // Scanner nesnesini kapat.
        scanner.close();
    }

}
