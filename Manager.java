public class Manager extends Employee {
    public Manager(String name, int id) {
        super(name, id);
    }
    @Override
    public void doWork() {
        System.out.println("Managing team...");
    }
}
