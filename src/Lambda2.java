//List<Integer> numbers = Arrays.asList(10, 3, 45, 8, 1, 22, 17, 5, 33, 2);
//```
//
//Using `Predicate`, `Consumer`, and `forEach`:
//
//        1. Create a `Predicate<Integer>` that checks if a number is **less than 20**
//        2. Create a `Consumer<Integer>` that prints `"Matched: X"` for each number
//3. Loop through the list — print only numbers that pass the predicate
//
//**Expected output:**
//        ```
//Matched: 10
//Matched: 3
//Matched: 8
//Matched: 1
//Matched: 17
//Matched: 5
//Matched: 2

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 3, 45, 8, 1, 22, 17, 5, 33, 2);

        Predicate<Integer> Isless = n->n<20;
        Consumer<Integer> print=n-> System.out.println("Matched : "+n);
        numbers.forEach(n->{
            if (Isless.test(n)){
                print.accept(n);
            }
        });

    }
}
