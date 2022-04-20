package Buidclass;

public class PartTimeEmployee extends Employee {
    private int Giolamviec;
    private int Chucvu;

public PartTimeEmployee(){

}
public PartTimeEmployee(String string, int age, String address, double salary, double rate,
int Giolamviec, int Chucvu){
super(string, age, address, salary, rate);
this.Giolamviec = Giolamviec;
this.Chucvu = Chucvu;
}
public void Hienthithongtin(){
    super.Hienthithongtin();
    System.out.println("\tGio lam viec: " + Giolamviec);
    System.out.println("\tChuc vu: " + Chucvu);
}   
}
