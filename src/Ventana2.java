import javafx.scene.control.RadioButton;

import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.BorderLayout;//Bordes
import java.awt.GridLayout;//Tabla
import java.awt.FlowLayout;//Fluidos
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana2 extends JFrame implements ActionListener{

    private JPanel Panel;
    private JPanel Panel2;

   private JLabel Texto;
    private JButton Boton,Boton2,Boton3,Boton4,Boton5,Boton6;
    private JRadioButton R1,R2,R3,R4,R5;


    public Ventana2(){

        this.setLayout(new BorderLayout());

        Panel=new JPanel();
        Panel2=new JPanel();

        Panel2.setLayout(new GridLayout(2,1));
        Panel.setLayout(new BoxLayout(Panel,BoxLayout.Y_AXIS));
        Panel2.setLayout(new BoxLayout(Panel2,BoxLayout.X_AXIS));





       JLabel picture=new JLabel(new ImageIcon("src/loro.png"));

        //Filas,Columnas,Libre entre filas,Libre entre columnas
/*
Texto=new JLabel("Hola Mundo");
Boton=new JButton("Oprime");
Boton2=new JButton("Cancelar");
*/

        Boton3=new JButton("Ingresar");
        Boton4=new JButton("Salir");
        Boton5=new JButton("Prueba");
        Boton6=new JButton("Prueba");
        R1=new JRadioButton("Loro");
        R2=new JRadioButton("Gato");
        R3=new JRadioButton("Perro");
        R4=new JRadioButton("Conejo");
        R5=new JRadioButton("Pato");


        getContentPane().add(picture);
        Panel.setBackground(Color.orange);
        Panel2.setBackground(Color.cyan);

//Se Añaden a la ventana principal (JFRAME)
this.add(Panel,BorderLayout.WEST);
this.add(Panel2,BorderLayout.SOUTH);




//Añadir paneles
//Panel.add(Texto);
//Panel2.add(Texto);
Panel.add(R1).setBackground(Color.orange);
Panel.add(R2).setBackground(Color.orange);
Panel.add(R3).setBackground(Color.orange);
Panel.add(R4).setBackground(Color.orange);
Panel.add(R5).setBackground(Color.orange);

getContentPane().setBackground(Color.orange);
Panel2.add(Boton3);
Panel2.add(Boton4);


//Panel2.add(Boton3);

//Panel.add(Boton4);
/*
//Añadir texto en paneles
Texto.setText("Hola mundo");
Boton.setText("Oprime");
//Panel.add(Boton).setBounds(200,200,300,500); //Posicion
Boton2.setText("Cancelar");
Boton3.setText("Ingresa");
Boton4.setText("Prueba");

*/



        this.R1.addActionListener(this);
this.R2.addActionListener(this);
this.R3.addActionListener(this);
this.R4.addActionListener(this);



        this.R5.addActionListener(this);

   }

// Eventos con actio envent

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource().equals(R1)){

            JLabel picture=new JLabel(new ImageIcon("src/loro.png"));

        }
        if(e.getSource().equals(R2)==true) {



            Texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/gato.jpg")));

        }
        if(e.getSource().equals(R3)){

            JLabel picture=new JLabel(new ImageIcon("src/loro.png"));

        }
        if(e.getSource().equals(R4)){

            JLabel picture=new JLabel(new ImageIcon("src/loro.png"));

        }
        if(e.getSource().equals(R5)){

            JLabel picture=new JLabel(new ImageIcon("src/loro.png"));

        }
        if(e.getSource().equals(R1)){

            JLabel picture=new JLabel(new ImageIcon("src/loro.png"));

        }
    }
}
