sealed interface PaymentStatus permits Pending, Completed, Failed {}

record Pending(String orderId) implements PaymentStatus {}
record Completed(String orderId, String txnId) implements PaymentStatus {}
record Failed(String orderId, String reason) implements PaymentStatus {}

public class Switch {
    public static void main(String[] args) {
        PaymentStatus status1 = new Completed("ORD123", "TXN456");
        PaymentStatus status2 = new Failed("ORD124", "Insufficient Balance");
        PaymentStatus status3 = new Pending("ORD125");

        processPayment(status1);
        processPayment(status2);
        processPayment(status3);
    }

    static void processPayment(PaymentStatus status) {
        String message = switch (status) {
            case Completed(String orderId, String txnId) ->
                    "Payment Success - Order: " +orderId+", Transaction: "+txnId;
            case Failed(String orderId, String reason) ->
                    "Payment Failed - Order: " +orderId+", Reason: "+reason;
            case Pending(String orderId) ->
                    "Payment Pending - Order: "+orderId;
        };

        System.out.println(message);
    }
}