import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JOptionPane ;

// Eventos 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class MyJFrame2 extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public MyJFrame2(){
		setTitle("BorderLayout con ejemplo");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para que pare la ejecución al cerrar el programa
		FlowLayout experimentLayout = new FlowLayout(); // el int muestra el aliniamneto entre lineas sin int no pone valores por defecto
		// este constructor tiene tres versiones  mirar la documentación:
		//https://docs.oracle.com/javase/8/docs/api/java/awt/FlowLayout.html#FlowLayout-int-
		
		// Creamos los botones:
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		JButton btn4 = new JButton("btn4");
		JButton btn5 = new JButton("btn5");
		JButton btn6 = new JButton("btn6");
		JButton btn7 = new JButton("btn7");
		JButton btn8 = new JButton("btn8 pongo mas texto para que no quepa en la mis a line ay salte a la siguiente");
		
		// añadimos los botones
		setLayout(experimentLayout);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		
		// añadimos el orden en que se dispondran en la pantalla
		setComponentOrientation(
                ComponentOrientation.LEFT_TO_RIGHT);
		
		// Añadimos los eventos
		btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"btn 1", "Botón pulsado", 2);
            }
        });
		
		btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"btn 2", "Botón pulsado", 2);
            }
        });
		
		btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"btn 3", "Botón pulsado", 2);
            }
        });
		
		btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"btn 4", "Botón pulsado", 2);
            }
        });
		
		btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"btn 5", "Botón pulsado", 2);
            }
        });
		
		btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"btn 6", "Botón pulsado", 2);
            }
        });
		
		btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"btn 7", "Botón pulsado", 2);
            }
        });
		
		btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"btn 8", "Botón pulsado", 2);
            }
        });
	}
}
