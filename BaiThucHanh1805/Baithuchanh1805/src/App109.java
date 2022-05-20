import java.util.ArrayList;

import java.util.Comparator;

import java.util.Scanner;
public class App109 {
    public static void main(String[] args) throws Exception {
        // khai bao 1 arraylist co ten Nam
        ArrayList<Integer> Nam = new ArrayList<>();
        
        //Them cac so nguyen vo mang Nam
        Nam.add(5);
        Nam.add(2);
        Nam.add(8);
        Nam.add(12);
        Nam.add(15);
        Nam.add(10);
        Nam.add(7);
        System.out.println("Cac phan tu trong mang : " +Nam);
        
        //gia tri max trong day
        int max = Nam.get(0) ;
        for(int i = 1 ; i < Nam.size() ; i++)
        {
            if(Nam.get(i).compareTo(max)>0)
            {
                max = Nam.get(i);
            }
        }
        System.out.println("Gia tri lon nhat trong day Nam la : " +max);
        
        //Nhap vao 1 so nguyen , trung xoa 
        int number;
        try (Scanner m = new Scanner(System.in)) {
            System.out.print("Nhap vao 1 so nguyen : ");
            number = m.nextInt();
        }
        Nam.add(number);
       
        
        //sap xep danh sach tang dan va in
        Nam.sort(Comparator.comparingInt(o -> o));
        System.out.println("Cac phan tu co trong Manh da sap xep la : " +Nam);
    }
}
