    package BodyMassIndex;

    import java.util.Scanner;

    public class BodyMassIndexCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
            double height = scanner.nextDouble();
            System.out.println("Lütfen kilonuzu giriniz : ");
            int weight = scanner.nextInt();

            double VKI = weight / (height * height);

            System.out.println("Vücut Kitle İndeksiniz : " + VKI);
            scanner.close();
        }
    }
