package Week1;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear, chineseZodiac;

        System.out.println("Doğum yılınızı giriniz:");
        birthYear = scanner.nextInt();
        chineseZodiac = birthYear % 12;

        switch (chineseZodiac) {
            case 0:
                System.out.println("Çin Zodyağı Burcunuz : Maymun ");
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz : Horoz ");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz : Köpek ");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz : Domuz ");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz :Fare ");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz :Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz :Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz :Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz :Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz :Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz :At");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz :Koyun");
            default:
                System.out.println("Hatalı Veri Girdiniz!");

        }
    }
}