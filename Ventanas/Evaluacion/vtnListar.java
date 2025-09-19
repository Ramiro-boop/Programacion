package Evaluacion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class vtnListar extends JFrame{
	Logica gestor = new Logica();
	
	public vtnListar(){
		
		this.setTitle("Listar");
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JButton btnListar = new JButton("Listar Productos");
		
		Object[] columnas = {"ID", "Producto","Precio"};
		
		DefaultTableModel modelo = new DefaultTableModel(null,columnas);
		
		
		JTable tabla = new JTable(modelo);
		
		JScrollPane scroll = new JScrollPane(tabla);
		
		this.add(btnListar,BorderLayout.NORTH);
		this.add(scroll,BorderLayout.CENTER);
		
		
		btnListar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				gestor.ListarLogica(modelo);
				
				
				
			}
		});
		
		
		
	}

}

