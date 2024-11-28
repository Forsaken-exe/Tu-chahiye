import java.util.*;

public class prac4a { 
        public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(); 
        map.put(1, "Apple"); 
        map.put(2, "Banana");
        map.put(3, "Fig"); 
        map.put(4, "Grapes");
        map.put(5, "Mango");

        System.out.println("MAP OF FRUITS ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) { 
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()); 
        }

        System.out.println("\nValue for key 2: " + map.get(2));
        map.remove(3);
        System.out.println("\nMap after removing key 3:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) { 
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()); 
        }
    }
}