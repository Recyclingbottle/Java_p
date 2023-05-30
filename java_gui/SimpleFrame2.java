package java_gui;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
public class SimpleFrame2 {
    public static void main(String [] args) {
        JFrame frame;
        Container contentPane;
        JLabel label;
        frame = new JFrame("MyFrame");
        frame.setSize(500, 300);
        contentPane = frame.getContentPane();
        label = new JLabel("Hello, WORLD!");
        contentPane.add(label);
        frame.setVisible(true);
    }
}
