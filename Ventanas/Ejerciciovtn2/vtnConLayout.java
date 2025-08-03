package Ejerciciovtn2;

import java.awt.*;

import javax.swing.*;

public class vtnConLayout extends JFrame{

	
	public vtnConLayout() {
		this.setTitle("Registrar Usuario");//Establece el título de la ventana
		this.setSize(600, 400);//Tamaño en PX. Primero el ancho y luego el largo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Acción default al cerrar
		this.setLocationRelativeTo(null);//Posición en la que inicia la ventanai
		this.setLayout(new GridLayout(2,1));
		
		JPanel panelArriba = new JPanel();
		panelArriba.setLayout(new GridLayout(5,2));
		
		JPanel panelAbajo = new JPanel();
		panelAbajo.setLayout(new FlowLayout(FlowLayout.LEFT));
		
	    JLabel lbl1 = new JLabel("Nombre:");
		JLabel lbl2 = new JLabel("Apellido:");
		JLabel lbl3 = new JLabel("Cedula:");
		JLabel lbl4 = new JLabel("Edad:");
		JLabel lbl5 = new JLabel("Rol:");
		
		JComboBox comboB = new JComboBox();
		
		JTextField tf1 = new JTextField(3);
		JTextField tf2 = new JTextField(3);
		JTextField tf3 = new JTextField(3);
		JTextField tf4 = new JTextField(3);
		
		
		
		JButton btn1 = new JButton("Registrar");
		
		this.add(panelArriba);
		
		panelArriba.add(lbl1);
		panelArriba.add(tf1);
		
		panelArriba.add(lbl2);
		panelArriba.add(tf2);
		
		panelArriba.add(lbl3);
		panelArriba.add(tf3);
		
		panelArriba.add(lbl4);
		panelArriba.add(tf4);
		
		panelArriba.add(lbl5);
		panelArriba.add(comboB);
		
		this.add(panelAbajo);
		panelAbajo.add(btn1);
	}
	
	
}
