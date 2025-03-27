package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ClosestPair {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int minDiff = Integer.MAX_VALUE;
        int biggerNumber = 0;
        int smallNumber = 0;

        while (numbers.size() < 10) {
            int randomNumber = random.nextInt(100);
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }

        Collections.sort(numbers);
        System.out.println("Sıralı liste:" + numbers);

        for (int i = 0; i < numbers.size() - 1; i++) {
            int diff = numbers.get(i + 1) - numbers.get(i);
            if (diff < minDiff) {
                minDiff = diff;
                biggerNumber = numbers.get(i + 1);
                smallNumber = numbers.get(i);
            }
        }

        System.out.println("Bigger Number: " + biggerNumber + " Small Number: " + smallNumber);
    }
}
