package java_15;

class PrintNumberRunnable implements Runnable {
    String myName;

    public PrintNumberRunnable(String name) {
        myName = name;
    }

    public void run() {
        for (int n = 0; n <= 10; n++) {
            System.out.print(myName + n + " ");
        }
    }
}

public class PrintNumber {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintNumberRunnable("A"));
        Thread t2 = new Thread(new PrintNumberRunnable("B"));
        t1.start();
        t2.start();
    }
}
