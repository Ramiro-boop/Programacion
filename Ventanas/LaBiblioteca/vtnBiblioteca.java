package LaBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vtnBiblioteca extends JFrame {

	Libro[] array = new Libro[10];

	public vtnBiblioteca() {

		this.setTitle("La biblioteca");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(2, 2));

		JPanel pArriba = new JPanel();
		pArriba.setLayout(new GridLayout(3, 2));

		JPanel pAbajo = new JPanel();

		JLabel lbl1 = new JLabel("ISBN:");
		JLabel lbl2 = new JLabel("Autor:");
		JLabel lbl3 = new JLabel("Titulo:");
		JLabel lbl4 = new JLabel("");
		lbl4.setSize(30, 40);
		lbl4.setFont(new Font("Arial", Font.BOLD, 20));

		JTextField tf1 = new JTextField(3);
		JTextField tf2 = new JTextField(3);
		JTextField tf3 = new JTextField(3);

		JButton btn1 = new JButton("Registrar Libro");
		JButton btn2 = new JButton("Mostrar Libros");

		this.add(pArriba);

		pArriba.add(lbl1);
		pArriba.add(tf1);
		pArriba.add(lbl2);
		pArriba.add(tf2);
		pArriba.add(lbl3);
		pArriba.add(tf3);

		this.add(pAbajo);
		pAbajo.add(btn1);
		pAbajo.add(btn2);
		pAbajo.add(lbl4);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (tf1.getText().isEmpty() || tf2.getText().isEmpty()|| tf3.getText().isEmpty()) {
					
					lbl4.setText("Rellené todos los campos");
				}else {
					RegistrarLibro(array, tf1, tf2, tf3);
					lbl4.setText("Libro Registrado con exito");

					LimpiarEntrada(tf1, tf2, tf3);
				}
				

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				MostrarLibros(array);

			}
		});

	}

	public static void RegistrarLibro(Libro[] array, JTextField tf1, JTextField tf2, JTextField tf3) {

		for (int i = 0; i < array.length; i++) {

			 if (array[i] == null) {
				array[i] = new Libro(tf1.getText(), tf2.getText(), tf3.getText());
				break;
			}

		}

	}

	public static void MostrarLibros(Libro[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				System.out.println((i + 1) + "-" + array[i]);
			}

		}

	}

	public static void LimpiarEntrada(JTextField tf1, JTextField tf2, JTextField tf3) {

		tf1.setText(null);
		tf2.setText(null);
		tf3.setText(null);

	}
}
