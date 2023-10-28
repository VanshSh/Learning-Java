import java.util.HashSet;

public class HashSetInJava {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(" U_U L-13 in HashSetInJava.java => " + cars.contains("BMW"));
        cars.remove("BMW");
        System.out.println(" U_U L-13 in HashSetInJava.java => " + cars.contains("BMW"));
        // cars.clear();
        System.out.println(cars.size());
        for (String i : cars) {
            System.out.println(i);
        }

    }
}
