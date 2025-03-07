package Week1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Kullanıcıdan sayı al
        System.out.println("Bir sayı giriniz:");
        int sayi = scanner.nextInt();

        int toplam = 0;
        //1den başlayarak sayı/2ye kadar olan tüm sayıların toplamını hesaplama
        for (int i = 1; i <= sayi / 2; i++) {
            int kalan = sayi % i;
            if (kalan == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == sayi) {
            System.out.println("Sayı " + sayi + " Mükemmel sayı!");

        } else {
            System.out.println("Sayı " + sayi + " Mükemmel sayı değil!");
        }
    }
}
