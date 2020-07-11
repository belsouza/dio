package Caroneiro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conclude extends JFrame {

    private JButton voltar;
    private JButton confirmar;
    private JLabel texto1;
    private JLabel texto2;
    private JLabel texto3;
    private Rent rent;

    public Conclude(){
        super("Segundo Foo");
    }

    public void getRentObject( Rent rent ){
        this.rent = rent;
    }

    public void response(){

        setLayout( new FlowLayout(FlowLayout.LEFT));

        BtnActions handler = new BtnActions();
        Source n = new Source();


        JLabel rot1 = new JLabel("Choosed Car: ");
        JLabel rot2 = new JLabel("Choosed Vacancy: ");
        JLabel rot3 = new JLabel("Remainder Vacancy: ");
        JLabel rot4 = new JLabel("Is correct the informations? ");

        String selecionado = n.getData()[rent.getIndex()];
        int diferenca = n.getNumeros()[rent.getIndex()] - rent.getNum();


        voltar = new JButton("Voltar");
        confirmar = new JButton("Confirmar");
        texto1 = new JLabel(selecionado);
        texto2 = new JLabel( String.valueOf(rent.getNum()));
        texto3 = new JLabel(String.valueOf(diferenca));

        voltar.addActionListener(handler);
        confirmar.addActionListener(handler);

        add(rot1);
        add(texto1);
        add(rot2);
        add(texto2);
        add(rot3);
        add(texto3);
        add(rot4);
        add(confirmar);
        add(voltar);
    }

    private class BtnActions implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == confirmar){
                JOptionPane.showMessageDialog(null,"Adicionado com sucesso!!");
                System.exit(0);
            }

            if(e.getSource() == voltar){
                try{
                   Compose m = new Compose();
                   m.getRentObject(rent);
                   m.response();
                   m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   m.setSize(400, 300);
                   m.setLocationRelativeTo(null);
                   m.setVisible(true);

                }
                catch (Exception err){

                }

            }

        }
    }
}
