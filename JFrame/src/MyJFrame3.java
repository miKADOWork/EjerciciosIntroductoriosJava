import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JOptionPane ;
import javax.swing.JPanel;

// Eventos 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame3 extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public MyJFrame3(){
		setTitle("BorderLayout con ejemplo");
		setSize(600, 600);
		int numFilas = 2;
		int numColumnas =2;
		GridLayout experimentLayout = new GridLayout(numFilas, numColumnas); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Creamos los botones:
		JButton btn1 = new JButton("Sóc 1");
		JButton btn2 = new JButton("Sóc 2");
		JButton btn3 = new JButton("Sóc 3");
		JButton btn4 = new JButton("Sóc 4");
		
		// Creamos el JPanel 
		 JPanel panel = new JPanel(experimentLayout);
		
		// añadimos los botones 
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		// añadimos el panel
		add(panel);
		
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
		
	}
}
