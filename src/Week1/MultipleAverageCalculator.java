package Week1;

import java.util.Scanner;

public class MultipleAverageCalculator {

    public static void main(String[] args) {
        // 3 ve 4'e tam bölünen sayıların toplamı
        int toplam = 0;
        // 3 ve 4'e tam bölünen sayıların sayısı
        int count = 0;
        // Scanner sınıfı ile kullanıcıdan sayı al
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan alınan sayı
        System.out.println("Bir sayı girin: ");

        int sayi = scanner.nextInt();
        //0dan girilen sayıya kadar olan sayıları kontrol et
        for (int i = 1; i <= sayi; i++) {
            //Hem 3e hem 4e bölünen sayıları kontrol et
            if (i % 3 == 0 && i % 4 == 0) {
                //Bu sayıyı toplama ekle
                toplam += i;
                //Bu sayıyı sayıya ekle
                count++;
            }
        }
        if (count > 0) {
            //Ortalamayı hesapla
            double ortalama = (double) toplam / count;
            System.out.println("3e ve 4e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3e ve 4e tam bölünen sayı bulunamadı ");

        }
    }
}