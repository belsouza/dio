package Caroneiro;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        Compose g = new Compose();
        g.response();
        g.setSize(400, 300);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setVisible(true);
        g.setLocationRelativeTo(null);
    }
}
