package Evaluacion;

import javax.swing.table.DefaultTableModel;

public class Logica {

	private MySQL BD = new MySQL();
	
	public static void main(String[] args) {
		
		
		vtnListar vtn1 = new vtnListar();
		vtn1.setVisible(true);

	}

	public void ListarLogica(DefaultTableModel modelo) {
		
		BD.listar(modelo);
		
		
	}
	
}
