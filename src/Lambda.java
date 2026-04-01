//List<Integer> numbers = Arrays.asList(3, 7, 2, 15, 8, 1, 20, 4, 13, 6);
//```
//
//Using **only lambdas** (no loops), do the following using `Predicate`, `Consumer`, and a simple `forEach`:
//
//        1. Create a `Predicate<Integer>` that checks if a number is **greater than 5**
//        2. Create a `Consumer<Integer>` that prints `"Number: X"` for each number
//3. Loop through the list — for numbers that pass the predicate, use the consumer to print them
//
//**Expected output:**
//        ```
//Number: 7
//Number: 15
//Number: 8
//Number: 20
//Number: 13
//Number: 6

import java.util.*;
import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 15, 8, 1, 20, 4, 13, 6);

        Predicate<Integer> Isgreater =(n->n>5);
        Consumer<Integer> so=n-> System.out.println("Numbers :"+n);

        numbers.forEach(n->{
            if(Isgreater.test(n)){
                so.accept(n);
            }
        });
    }
}
