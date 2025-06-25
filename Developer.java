
public class Developer extends Employee {
    public Developer(String name, int id) {
        super(name, id);
    }
    @Override
    public void doWork() {
        System.out.println("Writing code...");
    }
}
