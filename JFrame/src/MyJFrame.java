import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JOptionPane ;

// Eventos 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public MyJFrame(){
		setTitle("BorderLayout con ejemplo");
		setSize(600, 600);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Creamos los botones:
		JButton btn1 = new JButton("Hide North Border");
		JButton btn2 = new JButton("Hide South Border");
		JButton btn3 = new JButton("Hide West Border");
		JButton btn4 = new JButton("Hide East Border");
		JButton btn5 = new JButton("Hide Center Border");
		
		// añadimos los botones
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.SOUTH);
		add(btn3, BorderLayout.WEST);
		add(btn4, BorderLayout.EAST);
		add(btn5, BorderLayout.CENTER);
		
		// Añadimos los eventos
		btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"North btn", "Botón pulsado", 2);
            }
        });
		
		btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"South btn", "Botón pulsado", 2);
            }
        });
		
		btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"West btn", "Botón pulsado", 2);
            }
        });
		
		btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"East btn", "Botón pulsado", 2);
            }
        });
		
		btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is pressed
            	JOptionPane.showMessageDialog(null,"Center btn", "Botón pulsado", 2);
            }
        });
	}
}
