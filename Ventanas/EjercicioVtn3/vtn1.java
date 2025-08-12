package EjercicioVtn3;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vtn1 extends JFrame {

	Usuario[] arreglo = new Usuario[10];

	public vtn1() {

		this.setTitle("Título de mi Ventana");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(2, 1));
		
		
		JPanel panelArriba = new JPanel();
		panelArriba.setLayout(new GridLayout(4, 2));// (5,2)

		JPanel panelAbajo = new JPanel();

		JLabel user = new JLabel("Usuario");
		JLabel passw = new JLabel("Contraseña");

		JTextField tf1 = new JTextField();
		JTextField tf2 = new JTextField();

		JButton btn1 = new JButton("Guardar");

		this.add(panelArriba);

		panelArriba.add(user);
		panelArriba.add(tf1);
		panelArriba.add(passw);
		panelArriba.add(tf2);

		this.add(panelAbajo);
		panelAbajo.add(btn1);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String usuario = tf1.getText();
				String contraseña = tf2.getText();

		
				
				alta(arreglo,usuario,contraseña);
				mostrar(arreglo,usuario,contraseña);
				
				
				
				tf1.setText(null);
				tf2.setText(null);
			}

		});

	}

public static void alta(Usuario[] arreglo, String usuario,String contraseña) {
	
	for(int i = 0; i<arreglo.length; i++) {
		if(arreglo[i] == null ) {
			
			arreglo[i] = new Usuario(usuario,contraseña);
			break;
		}
		
		
		
	}
	
}
	
public static void mostrar(Usuario[] arreglo, String usuario,String contraseña) {
	
	for(int i = 0; i<arreglo.length; i++) {
		if(arreglo[i] != null ) {
			
			System.out.println((i+1) +"- " + arreglo[i]);
		}
		
		
		
	}
	
}
	
	
	
	
	
	
	
	
	
}
