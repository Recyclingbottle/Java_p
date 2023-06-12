package java_15;
import java.awt.*;
import javax.swing.*;

public class FlickeringLabelEx extends JFrame {
    public FlickeringLabelEx() {
        setTitle("FlickeringLabelEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // 깜박이는 레이블 생성
        FlickeringLabel fLabel = new FlickeringLabel("깜박");
        // 깜박이지 않는 레이블 생성
        JLabel label = new JLabel("안깜박");
        // 깜박이는 레이블 생성
        FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박");

        add(fLabel);
        add(label);
        add(fLabel2);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlickeringLabelEx();
    }
}

class FlickeringLabel extends JLabel implements Runnable {
    public FlickeringLabel(String text) {
        super(text); // JLabel 생성자 호출
        setOpaque(true); // 배경색 변경이 가능하도록 설정
        Thread th = new Thread(this);
        th.start();
    }

    public void run() {
        int n = 1;
        while (true) {
            if (n == 1)
                setBackground(Color.YELLOW);
            else
                setBackground(Color.GREEN);
            n *= -1;
            try {
                Thread.sleep(500); // 0.5초 동안 잠을 잔다.
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
