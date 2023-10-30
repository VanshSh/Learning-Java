// Extending method for thread

// public class ThreadsInJava extends Thread {
//   public static void main(String[] args) {
//     ThreadsInJava thread = new ThreadsInJava();
//     thread.start();
//     System.out.println("This code is outside of the thread");
//   }
//   public void run() {
//     System.out.println("This code is running in a thread");
//   }
// }

// Implementing methods for the thread
public class ThreadsInJava implements Runnable {
    public static void main(String[] args) {
        ThreadsInJava obj = new ThreadsInJava();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}