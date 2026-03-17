public class ThreadExec {
//    public static void main(String[] args) {
//        for (int i = 0; i < 10000; i++) {
//            int taskId = i;
//            Thread thread = new Thread(() -> {
//                System.out.println("Traditional Thread running: " + taskId);
//                try {
//                    Thread.sleep(1000); // simulate work
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//            thread.start();
//        }
//    }
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int taskId = i;
            Thread.startVirtualThread(() -> {
                System.out.println("Virtual Thread running: " + taskId);
                try {
                    Thread.sleep(1000); // simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}

