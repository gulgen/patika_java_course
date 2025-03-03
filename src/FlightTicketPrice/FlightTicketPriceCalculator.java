package FlightTicketPrice;

import java.util.Scanner;

public class FlightTicketPriceCalculator {

    public static final double DISTANCE_PRICE = 0.10;
    public static final int ROUND_TRIP = 2;

    public static void main(String[] args) {
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

        double price = distance * DISTANCE_PRICE;

        if (age <= 12) {
            discountedPrice = price * 0.50;
        } else if (age <= 24) {
            discountedPrice = price * 0.90;
        } else if (age >= 65) {
            discountedPrice = price * 0.70;
        }

        if (tripType == ROUND_TRIP) {
            discountedPrice = discountedPrice * 0.80 * 2;
        }

        System.out.println("Toplam Tutar =" + discountedPrice + "TL");
    }
}
