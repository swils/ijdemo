public class Main {
    public static void main(String args[]) {
        Counter c = new Counter(1);
        c.inc();
        c.inc();
        System.out.println(c.read());
    }
}
