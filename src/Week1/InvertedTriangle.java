package Week1;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        //Kullanıcıdan basamak sayısı al
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak sayısını girin: ");
        //Basamak sayısını tanımla
        int basamakSayisi = scanner.nextInt();
        for (int i = 0; i < basamakSayisi; i++) {
            //Her satırda basamak sayısını bir azalt
            int yildizSayisi = basamakSayisi - i;
            // Yıldızları yazdır
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }
            //Alt satıra yıldızları yazdır
            System.out.println();
        }
    }
}
