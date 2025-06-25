public abstract class Employee {
    protected String name;
    protected int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public abstract void doWork();     // tugas tiap karyawan berbeda
    public void clockIn() {
        System.out.println(name + " clocked in!");
    }
}
