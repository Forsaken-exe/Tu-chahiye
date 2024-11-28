import java.util.*;

public class prac4b { 
        public static void main(String[] args) {
        Set<String> fruits = new HashSet<>(); 
        fruits.add("Apple"); 
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Kiwi"); 

        System.out.println("Set of fruits:");
        for (String fruit : fruits) { 
            System.out.println(fruit);
        }

        System.out.println("\nSet contains Kiwi: " + fruits.contains("Kiwi")); 
        fruits.remove("Apple"); 
        System.out.println("\nSet after removing Apple:");
        System.out.println(fruits); 

        System.out.println("\nIterating using iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) { 
            System.out.println(iterator.next());
        }

        fruits.clear();
        System.out.println("\nSet after clearing: " + fruits); 
    }
}