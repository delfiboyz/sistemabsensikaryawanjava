public class Main {
    public static void main(String[] args) {
        Employee m = new Manager("Alice", 101);
        Employee d = new Developer("Bob", 102);

        m.clockIn();   // Alice clocked in!
        m.doWork();    // Managing team...
        d.clockIn();   // Bob clocked in!
        d.doWork();    // Writing code...
    }
}
