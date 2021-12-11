package com.naichuan.templatemethod.frame;

import javax.swing.*;
import java.awt.*;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "I rule!!!";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        new MyFrame("Head First Design Patterns");
    }
}
