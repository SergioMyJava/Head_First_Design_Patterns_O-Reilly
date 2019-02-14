package chapter2;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should i go?");
        button.addActionListener(event ->System.out.println("Don’t do it, you might regret it!"));
        button.addActionListener(event ->System.out.println("Come on, do it!"));
    }
}
