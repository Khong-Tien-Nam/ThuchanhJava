package Buidclass;
public class Person {
    private String name;
    private int age;
    private String address;

public Person(){

}
public Person(String string, int age, String address){
    this.name = string;
    this.age = age;
    this.address = address;
}
public void Hienthithongtin(){
    System.out.println("\tTen: " + name);
    System.out.println("\tTuoi: " + age);
    System.out.println("\tDiachi: " + address);
}
}
