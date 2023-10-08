public class testing {
    public static void main(String[] args) {
        System.out.println("Hello Vansh Sharma");
        System.out.println("Vansh Sharma");
        System.out.println(3 + 3);
        System.out.println(3 + 5);

        // Single line comment
        /*
         * Multiline comment
         * 
         */
        int myNum = 5;
        float myFloatNum = 5.99f;
        final char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        // myLetter = 'C';
        System.out.println(myNum);
        System.out.println("My letter " + myLetter);
        System.out.println(myFloatNum);

        // Type Casting
        // Widening (automatically)
        int myNumber = 5;
        double myDouble = myNumber;
        System.out.println(myNumber);
        System.out.println(myDouble);
        // Narrowing (manually)
        double myNarrow = 5.0;
        int myNarrowInt = (int) myNarrow;
        System.out.println("**==** L-33 in testing.java => " + myNarrow);
        System.out.println("**==** L-32 in testing.java => " + myNarrowInt);

        String txt = "Hello World";
        System.out.println("**==** L-36 in testing.java => " + txt.toLowerCase());
        System.out.println("**==** L-36 in testing.java => " + txt.toUpperCase());

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        String specialStr = "We are the so-called \"Vikings\" from the north.";
        System.out.println("**==** L-44 in testing.java => " + specialStr);
    }
}
