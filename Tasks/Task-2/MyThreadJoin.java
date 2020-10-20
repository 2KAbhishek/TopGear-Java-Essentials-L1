public class MyThreadJoin {
    public static void main(String[] args) {
        System.out.println("Older brother is studying...");
        SampleThread pizza = new SampleThread();
        pizza.start();

        try {
            pizza.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("Both brothers had pizza and are now going to bed.");
    }
}
