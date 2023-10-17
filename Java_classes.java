public class Java_classes {

    // Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:
    public void fullThrottle(){
        System.out.println(" U_U L-4 in java_classes.java => " + "The car is running at full speed. 🏎️");
    }

    static void speed(){
     System.out.println(" U_U L-8 in java_classes.java => " + "The car is running at 40Km/h speed.");   
    }
    int x = 5;
    String name = "Vansh Sharma";
    String fname = "John";
    String lname = "Doe";
    // final String name = "Vansh Sharma"
     

    public static void main(String[] args) {
        Java_classes obj1 = new Java_classes();
        Java_classes obj2 = new Java_classes();
        obj1.name = "Sharma";
        System.out.println(" U_U L-7 in java_classes.java => " + obj1.name);
        System.out.println(" U_U L-7 in java_classes.java => " + obj2.name);
        System.out.println(" U_U L-14 in java_classes.java => " + obj1.fname + " " + obj2.lname);
        Testing myCar = new Testing();     
          myCar.fullThrottlenew();      
          myCar.speednew(200); 
        
        // Accessing the statis and public method
        speed();

        Java_classes myCarObj = new Java_classes();
        myCarObj.fullThrottle();



        
    }
}
