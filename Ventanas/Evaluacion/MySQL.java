package Evaluacion;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MySQL {
	
	private final String URL = "jdbc:mysql://23.111.185.245/program1_avanzada?useSSL=false";
	private final String USR = "program1_estudiantes";
	private final String PSS = "estudiantesarrayanes";
	
	private Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL,USR,PSS);
	}
	
	public void listar(DefaultTableModel modelo) {
		
		String sentencia = "SELECT id, producto, precio FROM productos";
		
		modelo.setRowCount(0);
		
		try {
			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			ResultSet rs = declaracionSQL.executeQuery();
			
			while(rs.next()) {
				
				String id = rs.getString(1);
				String producto = rs.getString(2);
				int precio = rs.getInt(3);
				
				Object[] fila = {id,producto,precio};
				
				modelo.addRow(fila);
				
			}
			
			
			
			
			
			
		}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null,"Error" + e);
			
		}
		
	}
	
	
	
}
