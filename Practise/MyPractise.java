

import java.util.HashMap;

public class MyPractise {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        map.replace("A", 100); // Updates "A" to 100
        map.replace("C", 30);  // Won't work, as "C" doesn't exist

        System.out.println(map); // {A=100, B=20}
    }
}
