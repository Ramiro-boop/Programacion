package Clase_14_05_25;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {

        Scanner L = new Scanner(System.in);
        
        Auto Auto1 = new Auto(null, null, null, 0);
		
        System.out.println("Ingrese la marca del auto: ");
        Auto1.setMarca(L.nextLine());
        System.out.println("Ingrese el tipo del auto: ");
        Auto1.setTipo(L.nextLine());
        System.out.println("Ingrese el color del auto: ");
        Auto1.setColor(L.nextLine());
        System.out.println("Ingrese la cantidad de puertas del auto: ");
        Auto1.setPuertas(L.nextInt());
        
        System.out.println(Auto1);


	}

}
