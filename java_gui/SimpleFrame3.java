package java_gui;

import javax.swing.*;

public class SimpleFrame3 extends JFrame {
    SimpleFrame3(String title) {
        setTitle(title);
        setSize(500, 300);
        setVisible(true);
    }
    public static void main(String [] args) {
        SimpleFrame3 frame = new SimpleFrame3("MyFrame");
    }
}
