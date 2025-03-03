    package Patika_1_Practice.Practice_1;

    import java.util.Scanner;

    public class VucutKitleIndeksiHesaplama {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
            double boy = scanner.nextDouble();
            System.out.println("Lütfen kilonuzu giriniz : ");
            int kilo = scanner.nextInt();

            double VKI = kilo / (boy * boy);

            System.out.println("Vücut Kitle İndeksiniz : " + VKI);
            scanner.close();
        }
    }
