package java_15;

class TimerRunnable implements Runnable {
    int n = 0;
    
    public void run() {
        while (true) { // 무한 루프 실행
            System.out.println(n);
            n++;
            
            try {
                Thread.sleep(1000); // 1초 동안 잠을 잔 후 깨어남
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class TestRunnable {
    public static void main(String[] args) {
        Thread th = new Thread(new TimerRunnable());
        th.start();
    }
}
