package Caroneiro;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Compose extends JFrame {

    private JLabel numLabel;
    private JLabel textLabel;
    private JButton next;
    private JButton cancel;
    private JButton reset;
    private JTextField numero;
    private JComboBox carros;
    private String[] info;
    private int[] quant;
    private int index;
    private Rent rent;

    public Compose(){
        super("Foo");
    }

    public void response(){

        setLayout(new FlowLayout(FlowLayout.LEFT));

        ItemActions handler = new ItemActions();
        ButtonActions genhandler = new ButtonActions();
        Source data = new Source();
        Border t = BorderFactory.createEmptyBorder(5,5,5,150);

        rent = new Rent();


        info = data.getData();
        quant = data.getNumeros();


        String started = "Escolha um";
        carros = new JComboBox(info);
        carros.setBorder(t);
        carros.addItem(started);
        carros.setSelectedItem(started);
        

        next = new JButton("Next");
        reset = new JButton("Reset");
        cancel = new JButton("Cancel");
        numero = new JTextField(5);
        numLabel = new JLabel("Numero de coisas: ");
        JLabel blank = new JLabel("    ");
        blank.setBorder(t);
        textLabel = new JLabel("Carro Selecionado: ");


        next.addActionListener(genhandler);
        reset.addActionListener(genhandler);
        cancel.addActionListener(genhandler);
        numero.addActionListener(genhandler);
        carros.addItemListener(handler);
        textLabel.setBorder(t);

        //u.setName("foo");
        //u.setNum(5);

        add(textLabel);
        add(carros);
        add(numLabel);
        add(numero);
        add(blank);
        add(next);
        add(reset);
        add(cancel);
    }

    public void getRentObject( Rent rent ){
        this.rent = rent;
    }

    private class ItemActions implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {

            if(e.getStateChange() == ItemEvent.SELECTED){
                //System.out.println( info[carros.getSelectedIndex()] );
                index = carros.getSelectedIndex();
            }

        }
    }

    private class ButtonActions implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == next ){
               // System.out.println("Next");

                try{
                    int j = Integer.parseInt( numero.getText() );
                    rent.setNum( j );
                    rent.setIndex( index );

                    if(compareFields( j, quant[index])){

                        Conclude x = new Conclude();
                        x.getRentObject(rent);
                        x.setSize(200, 300);
                        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        x.setLocationRelativeTo(null);
                        x.setVisible(true);
                        x.response();


                        setVisible(false);

                    }

                }
                catch (Exception erro){
                    JOptionPane.showMessageDialog(null,"Voce precisa escolher algo!");
                }


            }

            if(e.getSource() == reset){
                //System.out.println("Reset");
                numero.setText("");
                carros.setSelectedItem("Escolha um");
            }

            if(e.getSource() == cancel){
                //System.out.println("Cancel");
                System.exit(0);
            }

            if(e.getSource() == numero){
                System.out.println(numero.getText());
            }

        }
    }

    private boolean compareFields ( int numfornecido, int limite ){
        if(numfornecido < limite){
            JOptionPane.showMessageDialog(null,"Ok! Ainda cabe " + (limite - numfornecido));
            return true;
            //System.out.println("Ok! Ainda cabe " + (limite - numfornecido));
        }
        else if( numfornecido == limite ){
           // System.out.println("Lotacao completa! ");
            JOptionPane.showMessageDialog(null,"Lotacao completa");
            return true;
        }
        else{
           // System.out.println("Ops! Numero de pessoas excedido! ");
            JOptionPane.showMessageDialog(null,"Ops! Numero de pessoas excedido!");
            return false;
        }
    }

}
