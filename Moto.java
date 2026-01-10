package DeberHerencia;

import java.util.Scanner;

public class Moto extends Vehiculo{

	int cilindrada;
	
	public Moto(String tipo,String marca,String color,int cilindrada) {
		super(tipo,marca,color);
		
		this.cilindrada = cilindrada;
	}
	
	public static void main(String[] args) {

		Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese la marca de la moto");
		String marca = L.next();
		System.out.println("Ingrese el tipo de la moto");
		String tipo = L.next();
		System.out.println("Ingrese el color de la moto");
		String color = L.next();
		System.out.println("Ingrese la cilindrada de la moto");
		int cilindrada = L.nextInt();
		
		Auto moto1 = new Auto(tipo,marca,color,cilindrada);
		System.out.println(moto1);
		
		

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Marca: " + marca + " Tipo: " + tipo + " Color: " + color + " Cilindrada: " + cilindrada;
	}

}
