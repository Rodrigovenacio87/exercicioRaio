package raioApplication;

import java.util.Locale;
import java.util.Scanner;

import util.calculadora;

public class Program {
	
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o raio: ");
		double raio = sc.nextDouble();
		calculadora calc = new calculadora();
		
		double c = calc.circuferencia(raio);
		double v = calc.volume (raio);
		
		
		System.out.printf("circuferencia: %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("Valor de Pi : %.2f%n", calc.PI);
	
				
		sc.close();
		
	}
	
	

}
