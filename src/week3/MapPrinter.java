package week3;

import java.util.HashMap;
import java.util.Map;

public class MapPrinter {
    public static void main(String[] args) {
        // HashMap oluştuma
        Map<String, Integer> map = new HashMap<>();

        // Map'e 5 farklı giriş ekleme
        map.put("Armut", 5);
        map.put("Motorsiklet", 2);
        map.put("Cep telefonu", 1);
        map.put("Dergi", 8);
        map.put("Kedi", 3);

        // Map içindeki tüm girişleri yazdırıyoruz
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

