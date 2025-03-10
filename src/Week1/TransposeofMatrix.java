package Week1;

import java.util.Scanner;

public class TransposeofMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan matris boyutlarını al
        System.out.println("Satır sayısını giriniz: ");
        int numberOfLines = scanner.nextInt();

        System.out.println("Sütun sayısını giriniz: ");
        int numberOfColums = scanner.nextInt();

        //Matrisin boyutlarını oluştur
        int[][] matrix = new int[numberOfLines][numberOfColums];

        //Kullanıcıdan matrisin elemanlarını al
        System.out.println("Matrisin elemamlarını girin: ");
        for (int i = 0; i < numberOfLines ; i++) {
            for (int j = 0; j < numberOfColums; j++) {
                System.out.print("Matris[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
            //Matrisin transpozunu oluştur,boyutları ters çevir
        int[][] transposeOfMatrix = new int[numberOfColums][numberOfLines];

        //Matrisin transpozunu al
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfColums; j++) {
                transposeOfMatrix[j][i] = matrix[i][j];
            }
        }
        //Matrisin transpozunu yazdır
        System.out.println("Transpoz matris: ");
        for (int i = 0; i < numberOfColums; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                System.out.print(transposeOfMatrix[i][j] + " ");
            }
            System.out.println();
            
        }

    }
}
