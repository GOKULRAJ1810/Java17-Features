//List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dan", "Eve", "Alexander");
//```
//
//Using `Predicate`, `Consumer`, and `forEach`:
//
//        1. Create a `Predicate<String>` that checks if a name **starts with the letter "A"**
//        2. Create a `Consumer<String>` that prints `"Hello, X!"` for each name
//3. Loop through the list — greet only names that start with "A"
//
//        **Expected output:**
//        ```
//Hello, Alice!
//Hello, Alexander!

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dan", "Eve", "Alexander");
        Predicate<String> IsStartA = s -> s.startsWith("A");
        Consumer<String> print=s-> System.out.println("Hello, "+s);
        names.forEach(s->{
            if (IsStartA.test(s)) print.accept(s);
        });
    }
}
