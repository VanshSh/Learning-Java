
// Import the HashMap class
import java.util.HashMap;

public class HashMapInJava {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(" U_U L-16 in HashMapInJava.java => " + capitalCities.get("USA"));
        System.out.println(" U_U L-16 in HashMapInJava.java => " + capitalCities.remove("USA"));
        // capitalCities.clear();
        System.out.println(" U_U L-19 in HashMapInJava.java => " + capitalCities);
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

    }
}