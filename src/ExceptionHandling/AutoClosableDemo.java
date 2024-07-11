package ExceptionHandling;

public class AutoClosableDemo implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("I am in close method");
    }

    public void run() {
        System.out.println("I am in run method");
    }

    public static void main(String[] args) {
        try (AutoClosableDemo demo = new AutoClosableDemo()) {// try with resources
            demo.run();
        } catch (Exception e) {
            System.out.println("caught");
        }
    }
}


