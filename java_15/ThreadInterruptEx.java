package java_15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnable1 implements Runnable {
    JLabel timerLabel;

    public TimerRunnable1(JLabel timerLabel) {
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

public class ThreadInterruptEx extends JFrame {
    Thread th;

    public ThreadInterruptEx() {
        setTitle("ThreadInterruptEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        add(timerLabel);
        JButton btn = new JButton("kill Timer");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                th.interrupt();
                JButton btn = (JButton) e.getSource();
                btn.setEnabled(false);
            }
        });
        add(btn);
        setSize(300, 150);
        setVisible(true);
        TimerRunnable1 runnable = new TimerRunnable1(timerLabel);
        th = new Thread(runnable);
        th.start();
    }

    public static void main(String[] args) {
        new ThreadInterruptEx();
    }
}
