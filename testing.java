public class testing {
    // Methods
    static void myMethod() {
        System.out.println(" U_U L-91 in testing.java => " + "I am method ");
    }

    // Method with some return
    static int myMethod(int x, int y) {
        return x + y;
    }

    // Method overloading same method
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    // Recursive function
    static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

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

        // Boolean
        boolean first = true;
        System.out.println(" U_U L-50 in testing.java => " + first);

        int myAge = 23;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println(" U_U L-55 in testing.java => " + "You can Vote");
        } else {
            System.out.println(" U_U L-57 in testing.java => " + "You can not vote");

        }

        // Switch

        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

        // For Each for the arrays
        String[] cars = { "1", "2", "3", "4", "5" };
        for (String car : cars) {
            System.out.println(" U_U L-76 in testing.java => " + car);
        }

        // Multidimensional arrays
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(" U_U L-84 in testing.java => " + myNumbers[i][j]);
            }
        }
        // Method calling
        myMethod();
        // Methd with parameters calling
        System.out.println(" U_U L-101 in testing.java => " + myMethod(5, 3));

        // Overloading method calling
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int x = 100;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x

        // Recursive methods output
        int result = sum(5, 10);
        System.out.println(" U_U L-143 in testing.java => " + result);

    }
}
