package gestion;

import java.util.Scanner;

public class Ppal2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		Persona p = new Persona();
		System.out.println("Nombre: ");
		p.setNombre(teclado.nextLine());
		
		System.out.println("Apellidos: ");
		p.setApellidos(teclado.nextLine());
		
		System.out.println("Peso (en Kg): ");
		p.setPeso(teclado.nextDouble());
		
		System.out.println("Altura (en cm): ");
		p.setAltura(teclado.nextDouble());
		
		System.out.println("Tus datos son: ");
		// p.mostrar();
		System.out.println(p);
		
		System.out.println("Tu indice de masas corporal es: "+p.calculaIMC());
		
		System.out.println(p);
		
	}

}
