package week3;

import java.util.*;

public class LetterFinding {

    public static void main(String[] args) {
        ArrayList<String> letter = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (letter.size() < 4) {
            char randomChar = (char) ('A' + random.nextInt(25));
            String randomLetter = String.valueOf(randomChar);
            if (!letter.contains(randomLetter)) {
                letter.add(randomLetter);
            }
        }
        for (int i = 1; i <=4; i++) {
            System.out.println(i +" . harfi giriniz:");
            String userInput = scanner.next().toUpperCase();
            if (letter.contains(userInput)) {
                System.out.println("found");
            }else {
                letter.add(userInput);
            }
        }
        System.out.println("Güncellenmiş liste: " + letter);

    }
}
