package fundamentos;

import java.util.Scanner;

public class ElseIF {
	
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		
		double nota = entrada.nextDouble();
		
		if(nota>10||nota<0) {
			System.out.println("Nota Invalida!");
		} else if (nota>=8.1) {
				System.out.println("Conceito A");
				System.out.println("Parabens!");
		} else {  
			if (nota >=6.1) {
					System.out.println("Conceito B");
		} else {
			if (nota >=4.1) {
					System.out.println("Conceito C");
		} else {
			if (nota >=2.1) {
					System.out.println("Conceito D");
		} else {
			if (nota <=2.0) {
						System.out.println("Reprovado!");
			}
			}
			}
			}
			
		}
		
		System.out.println("FIM!");		
		entrada.close();
	}
}
