package week5.method_reference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ahmet", "Ayşe", "Mehmet", "Zeynep");

        Printer printer = new Printer();

        names.forEach(printer::print);
    }
}
