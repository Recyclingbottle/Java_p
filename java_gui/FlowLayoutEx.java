package java_gui;

import javax.swing.*;
import java.awt.*;
public class FlowLayoutEx extends JFrame {
    FlowLayoutEx() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); 
        // 왼쪽 정렬, 수평 간격 30, 수직 간격 40 픽셀
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        contentPane.add(new JButton("add"));
        contentPane.add(new JButton("sub"));
        contentPane.add(new JButton("mul"));
        contentPane.add(new JButton("div"));
        contentPane.add(new JButton("Calculate"));
        setSize(300, 200); // 프레임 크기 300x200
        setVisible(true); // 화면에 프레임 출력
        }
    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}
