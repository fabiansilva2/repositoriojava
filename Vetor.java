package fundamentos;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas notas: ");
		
		int qtdNotas = entrada.nextInt();
		double [] notas = new double [qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1)+ ": ");
			notas[i] = entrada.nextInt();
						
		}
		
		System.out.println(Arrays.toString(notas));
				
		
		entrada.close();
	
		
		
	}

}
