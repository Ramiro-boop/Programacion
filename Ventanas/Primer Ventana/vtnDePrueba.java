package EjercicioVtn1;

import java.awt.*;

import javax.swing.*;

public class vtnDePrueba extends JFrame{
	
	
	public vtnDePrueba() {
		
		this.setTitle("Ventana de Prueba - Ramiro Sosa");//Establece el título de la ventana
		this.setSize(600, 400);//Tamaño en PX. Primero el ancho y luego el largo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Acción default al cerrar
		this.setLocationRelativeTo(null);//Posición en la que inicia la ventanai
		this.setMinimumSize(new Dimension(600,400));//Evita que se pueda achicar la ventana
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		
		JLabel etiqueta1 = new JLabel("Bienvenido a mi programa");
		etiqueta1.setBounds(10,10,150,25);
		etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel etiqueta2 = new JLabel("Nombre:");
		etiqueta2.setBounds(10,30,50,40);
		
		
		JTextField input = new JTextField(9);
		input.setBounds(60,40,90,20);
		
		JButton boton = new JButton("Aceptar");
		boton.setBounds(25,70,150,25);
		
		this.add(panel);		
		panel.add(etiqueta1);
		panel.add(etiqueta2);
		panel.add(input);
		panel.add(boton);
		
	}

}
