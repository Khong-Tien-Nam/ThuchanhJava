import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> abc = new LinkedList<>();
        abc.add("java");
        abc.add("C++");
        abc.add("PHP");
        abc.add("Java");

        System.out.print("Ví dụ sử dụng phương thức addAll()");
        System.out.print("----------------------------------");

        LinkedList<String> ListA = new LinkedList<>();
        ListA.addAll(abc);
        System.out.print("ListA : ");
        showList(ListA);

        System.out.println("\nVí dụ sử dụng phương thức retainAll() ");
        System.out.println("----------------------------------------");

        LinkedList<String> ListB = new LinkedList<>();
        ListB.add("Java");
        ListA.retainAll(ListB);
        System.out.print("ListA: ");
        showList(ListA);
        
        System.out.println("\n Sử dụng phương thức removeAll()");
        System.out.println("-----------------------------------");
        abc.removeAll(ListB);
        System.out.print("ListA: ");
        showList(abc);
    }

    public static void showList(LinkedList<String> abc)
    {
    
        for(String obj : abc )
        {
            System.out.println("\t" + obj + " , ");
        }
        System.out.println();
    }
}