package Buidclass;

public class Student extends Person{
    private String gender;
    private double GPA;

    public Student(){

    }
    public Student(String string, int age, String address, String gender, double GPA){
    super(string, age, address);
    this.gender = gender;
    this.GPA = GPA;
    } 
    public void Hienthithongtin(){
        super.Hienthithongtin();
        System.out.println("\tDiachi: " + gender);
        System.out.println("\tGioitinh: " + GPA);
    }
}
