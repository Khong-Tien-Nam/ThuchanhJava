package Buidclass;

public class Employee extends Person {

    private double salary;
    private double rate;
    // Ham khoi tao khong tham so
    public Employee() {

    }
    // Ham khoi tao co tham so
    public Employee(String string, int age, String address, double salary, double rate) {
        super(string, age, address);
        this.salary = salary;
        this.rate = rate;
    }
    // Ham hien thi thong tin
    public void Hienthithongtin() {
        super.Hienthithongtin();
        System.out.println("\tLuong: " + salary);
        System.out.println("\tRate: " + rate);
    }
}
