package week5;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5));

        numbers.replaceAll(x -> x * 2);

        numbers.forEach(x -> System.out.println(x));
    }
}
