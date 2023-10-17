public class Java_Constructor {
    int year_value;
    String name_value;

    public Java_Constructor(int year, String name) {
        year_value = year;
        name_value = name;

    }

    public static void main(String[] args) {
        Java_Constructor jc = new Java_Constructor(5, "Vansh Sharma");
        System.out.println(" U_U L-13 in Java_Constructor.java => " + jc.year_value);
        System.out.println(" U_U L-13 in Java_Constructor.java => " + jc.name_value);
        
    }
    
}
