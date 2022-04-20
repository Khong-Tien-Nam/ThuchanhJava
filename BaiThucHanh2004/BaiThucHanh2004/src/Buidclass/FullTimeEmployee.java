package Buidclass;

public class FullTimeEmployee extends Employee{
    private int Ngaylamviec;
    private String Loaichucvu;

public FullTimeEmployee(){

}
public FullTimeEmployee(String string, int age, String address, double salary, double rate,
int Ngaylamviec, String Loaichucvu){
    super(string, age, address, salary, rate);
    this.Ngaylamviec = Ngaylamviec;
    this.Loaichucvu = Loaichucvu;
}
public void Hienthithongtin(){
    super.Hienthithongtin();
    System.out.println("\tNgay lam viec: " + Ngaylamviec);
    System.out.println("\tLoai chuc vu: " + Loaichucvu);
}
}
