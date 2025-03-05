package Week1;

import java.util.Scanner;

public class FlightTicketPriceCalculator {

    static double DISTANCE_PRICE = 0.10;

    public static void main(String[] args) {
        int roundTrip = 2;
        double discountedPrice = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz :");
        int distance = scanner.nextInt();
        System.out.println("Yaşınızı giriniz :");
        int age = scanner.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int tripType = scanner.nextInt();

        if (distance <= 0 || age <= 0 || tripType != 1 && tripType != 2) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

     if (tripType == 1) System.out.println("TEKYÖN");

        System.out.println(tripType == 1 ? "TEKYÖN" : "ÇİFTYÖN");

        double price = distance * DISTANCE_PRICE;

        if (age <= 12) {
            discountedPrice = price * 0.50;
        } else if (age <= 24) {
            discountedPrice = price * 0.90;
        } else if (age >= 65) {
            discountedPrice = price * 0.70;
        }

        if (tripType == roundTrip) {
            discountedPrice = discountedPrice * 0.80 * 2;
        }

        System.out.println("Toplam Tutar =" + discountedPrice + "TL");
    }
}
