//List<String> orders = Arrays.asList(
//        "ORD001-500.0", "ORD002-1500.0", "ORD003-200.0",
//        "ORD004-3000.0", "ORD005-750.0", "ORD006-1200.0"
//);
//```
//
//Each order is in the format `"ORDXXX-amount"`. Using **only Streams**:
//
//        1. Filter orders where amount is **greater than 600**
//        2. Map each to `"Approved: ORDXXX"` (strip the amount)
//        3. Sort them alphabetically
//4. Print each one using `forEach`
//
//        **Expected output:**
//        ```
//Approved: ORD002
//Approved: ORD004
//Approved: ORD005
//Approved: ORD006






//
//List<String> employees = Arrays.asList(
//        "Alice-Engineering-75000",
//        "Bob-Marketing-45000",
//        "Charlie-Engineering-90000",
//        "Dan-Marketing-60000",
//        "Eve-Engineering-50000",
//        "Frank-HR-40000"
//        );
//        ```
//
//        Each employee is in the format `"Name-Department-Salary"`. Using **only Streams**:
//
//        1. Filter employees who are in **Engineering** department
//        2. Filter only those with salary **greater than 60000**
//        3. Map each to `"Promoted: Name"` (only the name)
//        4. Sort alphabetically
//        5. Print each one using `forEach`
//
//        **Expected output:**
//        ```
//        Promoted: Alice
//        Promoted: Charlie




//
//List<String> employees = Arrays.asList(
//        "Alice-Engineering-75000",
//        "Bob-Marketing-45000",
//        "Charlie-Engineering-90000",
//        "Dan-Marketing-60000",
//        "Eve-Engineering-50000",
//        "Frank-HR-40000"
//        );
//        ```
//
//        Write **two separate** stream pipelines:
//
//        **Pipeline 1 — using `reduce`:**
//        Find the **total salary** of all Engineering department employees.
//
//        **Pipeline 2 — using `groupingBy`:**
//        Group all employees by department and print the **count** of employees in each department.
//
//        **Expected output:**
//        ```
//        // Pipeline 1
//        Total Engineering salary: 215000.0
//
//// Pipeline 2
//        Engineering → 3
//        Marketing → 2
//        HR → 1


//List<String> users = Arrays.asList(
//        "Gokul-Chennai-28",
//        "Alice-Mumbai-17",
//        "Bob-Delhi-32",
//        null,
//        "Eve-Bangalore-22"
//        );
//        ```
//
//        Using `Optional` and Streams:
//
//        1. Wrap each user in `Optional.ofNullable`
//        2. Filter out empty Optionals
//        3. Filter users whose age is **18 or above**
//        4. Map each to `"Eligible: Name"` (only the name)
//        5. Print each result
//
//        **Expected output:**
//        ```
//        Eligible: Gokul
//        Eligible: Bob
//        Eligible: Eve



import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StreamOp {
    public static void main(String[] args) {
        List<String> orders = Arrays.asList(
        "ORD001-500.0", "ORD002-1500.0", "ORD003-200.0",
        "ORD004-3000.0", "ORD005-750.0", "ORD006-1200.0"
        );
    List<String> employees = Arrays.asList(
        "Alice-Engineering-75000",
        "Bob-Marketing-45000",
        "Charlie-Engineering-90000",
        "Dan-Marketing-60000",
        "Eve-Engineering-50000",
        "Frank-HR-40000"
    );

    List<String> employee = Arrays.asList(
    "Alice-Engineering-75000",
    "Bob-Marketing-45000",
    "Charlie-Engineering-90000",
    "Dan-Marketing-60000",
    "Eve-Engineering-50000",
    "Frank-HR-40000"
    );

    List<String> users = Arrays.asList(
    "Gokul-Chennai-28",
    "Alice-Mumbai-17",
    "Bob-Delhi-32",
    null,
    "Eve-Bangalore-22"
    );

    users.stream().filter(u -> Optional.ofNullable(u).isPresent()) .filter(u->Integer.parseInt(u.split("-")[2])>=18).forEach(System.out::println);



        double total = employees.stream()
                .filter(e -> e.split("-")[1].equals("Engineering"))
                .mapToDouble(e -> Double.parseDouble(e.split("-")[2]))
                .sum();

        System.out.println("Total Engineering salary: " + total);


        employee.stream().collect(Collectors.groupingBy(e->e.split("-")[1],Collectors.counting())).forEach((dept,count)-> System.out.println("DEPT "+dept+" Count "+count));

        //orders.stream().filter(n->Double.parseDouble(n.split("-")[1])>600).map(n->"Approved :"+n.split("-")[0]).sorted().collect(Collectors.toList()).forEach(System.out::println);

        employees.stream().filter(s->s.split("-")[1].equals("Engineering")).filter(s->Double.parseDouble(s.split("-")[2])>60000).map(s->"Promoted :"+s.split("-")[0]).sorted().collect(Collectors.toList()).forEach(System.out::println);
    }
}
