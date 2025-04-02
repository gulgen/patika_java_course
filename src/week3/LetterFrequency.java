package week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String input = scanner.nextLine();
        scanner.close();

        Map<Character , Integer> frequencys = calculateLetterFrequency(input);

        for (Map.Entry<Character, Integer>entry : frequencys.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }

    private static Map<Character, Integer> calculateLetterFrequency(String input) {
        Map<Character, Integer> letterFrequency = new HashMap<>();
        input = input.toLowerCase();

        for (char ch: input.toCharArray()){
            if (Character.isLetter(ch)){
                letterFrequency.put(ch, letterFrequency.getOrDefault(ch, 0) + 1);
            }

        }
        return letterFrequency;
    }
}
