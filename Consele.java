package fundamentos;

import java.util.Scanner;

public class Consele {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.println(" dia!!!");
		System.out.println("Bom ");
		System.out.println("dia!!!");
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("\nEste (a) é o (a) "+ nome+ " "+sobrenome+ " ele (a) tem "+idade+" anos");
		//System.out.printf("%s %s tem %d anos.%n",
		//		nome, sobrenome, idade);
		
		entrada.close();
		
		
		
	}

}
