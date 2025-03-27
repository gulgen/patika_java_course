package week2;

import java.util.Scanner;

public class PasswordCheck {

        public static void main(String[] args) {
            // Kullanıcıdan şifreyi al
            Scanner scanner = new Scanner(System.in);
            System.out.print("Şifrenizi girin: ");
            String password = scanner.nextLine();

            // 1. Şifre uzunluğunu kontrol et
            if (password.length() < 8) {
                System.out.println("Geçersiz Şifre");
                return;
            }

            // 2. Boşluk karakterini kontrol et
            if (password.contains(" ")) {
                System.out.println("Geçersiz Şifre");
                return;
            }

            // 3. İlk harfi büyük harf olmalı
            if (!Character.isUpperCase(password.charAt(0))) {
                System.out.println("Geçersiz Şifre");
                return;
            }

            // 4. Son karakterin '?' olmalı
            if (password.charAt(password.length() - 1) != '?') {
                System.out.println("Geçersiz Şifre");
                return;
            }

            // Eğer tüm kontrolleri geçtiyse, şifre geçerli
            System.out.println("Geçerli Şifre");
        }
    }

