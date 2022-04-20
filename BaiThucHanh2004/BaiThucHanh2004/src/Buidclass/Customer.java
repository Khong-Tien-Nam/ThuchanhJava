package Buidclass;

public class Customer extends Person{
    private int ID;
    private String Email;

public Customer(){

}
public Customer(String string, int age, String address, int ID, String Email){
super(string, age, address);
this.ID = ID;
this.Email = Email;
}
public void Hienthithongtin(){
    super.Hienthithongtin();
    System.out.println("\tID: " + ID);
    System.out.println("\tEmail: " + Email);
}
}
