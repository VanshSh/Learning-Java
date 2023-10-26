import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Vansh");
        list.add("Himanshu");
        list.add("Anuj");
        list.add("Mohit");
        System.out.println(" U_U L-12 in ArrayListInJava.java => " + list);
        System.out.println(" U_U L-12 in ArrayListInJava.java => " + list.get(3));
        System.out.println(" U_U L-12 in ArrayListInJava.java => " + list.set(2, "Pranjal"));
        System.out.println(" U_U L-12 in ArrayListInJava.java => " + list.size());
        System.out.println(" U_U L-12 in ArrayListInJava.java => " + list.remove(3));
        for (String i : list) {
            System.out.println(" U_U L-17 in ArrayListInJava.java => " + i);
        }
        Collections.sort(list);
        for (String i : list) {
            System.out.println(" U_U L-21 in ArrayListInJava.java => " + i);
        }
    }
}