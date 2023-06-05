package java_14;

import java.awt.*;
import javax.swing.*;

public class ThreadTimerEx extends JFrame {
    public ThreadTimerEx() {
        setTitle("ThreadTimerEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        add(timerLabel);

        setSize(300, 150);
        setVisible(true);

        TimerThread th = new TimerThread(timerLabel);
        th.start();
    }

    public static void main(String[] args) {
        new ThreadTimerEx();
    }
}

class TimerThread extends Thread {
    JLabel timerLabel;

    public TimerThread(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
