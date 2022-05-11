import java.util.ArrayList;
public class Array {
    public static void main(String[] args) throws Exception {

        ArrayList<String> abc = new ArrayList<>();
        abc.add("JAVA");
        abc.add("PHP");
        abc.add("C#");
        abc.add("C++");

        abc.set(1,"RUBY");
        abc.add(3,"PYTHON");
        abc.remove(3);

        System.out.print("Các giá trị của ArrayList là : ");
        for(int i = 0 ; i < abc.size() ; i++)
            {
                System.out.print(abc.get(i) + "\t");
            }
    }
}