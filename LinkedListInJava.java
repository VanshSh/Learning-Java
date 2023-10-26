import java.util.LinkedList;

public class LinkedListInJava {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    // Use removeFirst() remove the first item from the 
    cars.removeFirst();
    System.out.println(cars);
    System.out.println(" U_U L-14 in LinkedListInJava.java => " + cars.getFirst());
  }
}
