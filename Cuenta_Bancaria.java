package clase_09_04_25;

import java.util.Scanner;

public class Cuenta_Bancaria {
	
	String propietario;
	String banco;
	int PIN;
	double saldo;
	
public Cuenta_Bancaria (String propietario,String banco, int PIN,double saldo ){
		
		this.propietario = propietario;
		this.banco = banco;
		this.PIN  = PIN;
		this.saldo= saldo;
		
	}

	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Cuenta bancaria 1:");
		System.out.println("Ingrese el nombre del propietario ");
		System.out.print(">");
		String prop1 = L.next();
		System.out.println("Ingrese el banco");
		System.out.print(">");
		String banco1 = L.next();
		System.out.println("Ingrese el PIN");
		System.out.print(">");
		int PIN1 = L.nextInt();
		System.out.println("Ingrese el saldo");
		System.out.print(">");
	    double saldo1= L.nextDouble();
		Cuenta_Bancaria CuentaB1 = new Cuenta_Bancaria(prop1,banco1,PIN1,saldo1);
		System.out.println("");
		
		System.out.println("Cuenta bancaria 2:");
		System.out.println("Ingrese el nombre del propietario ");
		System.out.print(">");
		String prop2 = L.next();
		System.out.println("Ingrese el banco");
		System.out.print(">");
		String banco2 = L.next();
		System.out.println("Ingrese el PIN");
		System.out.print(">");
		int PIN2 = L.nextInt();
		System.out.println("Ingrese el saldo");
		System.out.print(">");
	    double saldo2 = L.nextDouble();
		Cuenta_Bancaria CuentaB2 = new Cuenta_Bancaria(prop2,banco2,PIN2,saldo2);
		System.out.println("");		
		
		System.out.println("Cuenta bancaria 1:");
		System.out.println("Propietario: " + CuentaB1.propietario);
		System.out.println("Banco " + CuentaB1.banco);
		System.out.println("PIN: "+ CuentaB1.PIN);
		System.out.println("Saldo: " + CuentaB1.saldo);
		System.out.println(" ");
		

		System.out.println("Cuenta bancaria 2:");
		System.out.println("Propietario: " + CuentaB2.propietario);
		System.out.println("Banco " + CuentaB2.banco);
		System.out.println("PIN: "+ CuentaB2.PIN);
		System.out.println("Saldo: " + CuentaB2.saldo);
		System.out.println(" ");
		
		
		
	}

}
