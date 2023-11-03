import java.io.File; // Import the File class

public class deleteFilesinJava {
    public static void main(String[] args) {
        File myObj = new File("testing.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}