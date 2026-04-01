import java.util.function.Consumer;
import java.util.function.Predicate;

//Your Task 🟡
//Create your own functional interface called OrderProcessor that:
//
//Takes two parameters — String orderId and double amount
//Returns a String — the result message
//
//Then create two lambdas using it:
//
//One that returns "Processed: X for Rs.Y" if amount is positive
//One that returns "Rejected: X" if amount is zero or negative
//
//Test both with a sample order.
public class FunctionalIntf {
    @FunctionalInterface
    interface OrderProcessor{
        String validate(String orderId,double amount);
    }

    public static void main(String[] args) {

        OrderProcessor orderProcessor=(orderId,amount)->{
            if(amount>0) return "Processed: "+orderId;
            return "Rejected: "+orderId+" amount is zero or negative";
        };

        String result=orderProcessor.validate("gokul12331",1234.0);
        System.out.println(result);
        String result2=orderProcessor.validate("gokul312312",0);
        System.out.println(result2);

    }
}
