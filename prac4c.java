import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class prac4c {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(); 
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("List of fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit); 
        }

       
        System.out.println("\nElement at index 2: " + fruits.get(2));

        
        fruits.remove("Banana");
        System.out.println("\nList after removing Banana:");
        for (String fruit : fruits) {
            System.out.println(fruit); 
        }

        System.out.println("\nIterating using ListIterator:");
        ListIterator<String> iterator = fruits.listIterator(); 
        while (iterator.hasNext()) { 
            System.out.println(iterator.next()); 
        }
    }
}
