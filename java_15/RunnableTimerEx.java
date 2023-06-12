package java_15;

import java.awt.*;
import javax.swing.*;

public class RunnableTimerEx extends JFrame {
    public RunnableTimerEx() {
        setTitle("RunnableTimerEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        add(timerLabel);

        setSize(300, 150);
        setVisible(true);

        TimerRunnable runnable = new TimerRunnable(timerLabel);
        Thread th = new Thread(runnable);
        th.start();
    }
    public static void main(String[] args) {
        new RunnableTimerEx();
    }
    
}

class TimerRunnable implements Runnable {
    JLabel timerLabel;
    
    public TimerRunnable(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
