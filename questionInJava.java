// SUM OF NUMBERS 👇🏻
// import java.util.Scanner;

// public class questionInJava {
//     public static void main(String[] args) {
//         int x, y, sum;

//         Scanner sumOfNumbers = new Scanner(System.in);
//         System.out.println("Type a number:");
//         x = sumOfNumbers.nextInt(); // Read user input

//         System.out.println("Type another number:");
//         y = sumOfNumbers.nextInt(); // Read user input

//         sum = x + y; // Calculate the sum of x + y
//         System.out.println("Sum is: " + sum); // Print the sum

//     }

// }

// Count Number of Words in a String 👇🏻
public class questionInJava {
    public static void main(String[] args) {
        String words = "One Two Three Four";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}