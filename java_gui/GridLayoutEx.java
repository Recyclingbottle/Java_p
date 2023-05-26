package java_gui;

import java.awt.*;
import javax.swing.*;
public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        super("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); 
        // 1x10의 GridLayout 배치관리자
        contentPane.setLayout(new GridLayout(1, 10)); 
        for(int i=0; i<10; i++) { // 10개 버튼 부착
        String text = Integer.toString(i);
        JButton button = new JButton(text);
        contentPane.add(button);
        }
        setSize(500, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutEx();
    }
}