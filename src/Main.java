public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println(System.currentTimeMillis());
        try {
            Thread.sleep(10l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(System.currentTimeMillis());
    }
}