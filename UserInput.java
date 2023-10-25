import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(" U_U L-7 in UserInput.java => " + "Enter name , age , salary");
        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }
}
