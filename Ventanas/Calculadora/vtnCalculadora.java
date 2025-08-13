package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vtnCalculadora extends JFrame {

	public vtnCalculadora() {

		this.setTitle("Calculadora");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(3, 1));

		JPanel pArriba = new JPanel();
		pArriba.setLayout(new GridLayout(2, 2));
		

		JPanel pMedio = new JPanel();
		

		JPanel pAbajo = new JPanel();
		

		JLabel lbl1 = new JLabel("Ingrese el Número 1: ");
		JLabel lbl2 = new JLabel("Ingrese el Número 2: ");
		JLabel lbl3 = new JLabel("Bienvenido");
		lbl3.setSize(30, 40);
		lbl3.setFont(new Font("Arial",Font.BOLD,20));
		
		JTextField tf1 = new JTextField(9);
		JTextField tf2 = new JTextField(9);

		JButton btn1 = new JButton("Suma +");
		JButton btn2 = new JButton("Resta -");
		JButton btn3 = new JButton("Multiplicación *");
		JButton btn4 = new JButton("División /");
		JButton btn5 = new JButton("Limpiar");
		

		this.add(pArriba);
		pArriba.add(lbl1);
		pArriba.add(tf1);
		pArriba.add(lbl2);
		pArriba.add(tf2);

		this.add(pMedio);

		pMedio.add(lbl3);

		this.add(pAbajo);

		pAbajo.add(btn1);
		pAbajo.add(btn2);
		pAbajo.add(btn3);
		pAbajo.add(btn4);
		pAbajo.add(btn5);
		

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lbl3.setText("La suma da: " + Suma(tf1, tf2));

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lbl3.setText("La resta da: " + Resta(tf1, tf2));

			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lbl3.setText("La multiplicación da: " + Multi(tf1, tf2));

			}
		});

		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lbl3.setText("La división da: " + Div(tf1, tf2));

			}
		});
		
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				tf1.setText(null);
				tf2.setText(null);
				
				lbl3.setText("Clean");
				
				
				
			}
		});
	}

	public static double Suma(JTextField tf1, JTextField tf2) {

		double num1 = Double.parseDouble(tf1.getText());
		double num2 = Double.parseDouble(tf2.getText());

		double suma = num1 + num2;

		return suma;

	}

	public static double Resta(JTextField tf1, JTextField tf2) {

		double num1 = Double.parseDouble(tf1.getText());
		double num2 = Double.parseDouble(tf2.getText());

		double resta = num1 - num2;

		return resta;

	}

	public static double Multi(JTextField tf1, JTextField tf2) {

		double num1 = Double.parseDouble(tf1.getText());
		double num2 = Double.parseDouble(tf2.getText());

		double multi = num1 * num2;

		return multi;

	}

	public static double Div(JTextField tf1, JTextField tf2) {

		double num1 = Double.parseDouble(tf1.getText());
		double num2 = Double.parseDouble(tf2.getText());

		double Div = num1 / num2;

		return Div;

	}

}
