package fundamentos;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		
		//String resultadoRecuperacao
		String resultadoFinal = media >= 7.0 ? "Aprovado." : "de Recuperação.";
		System.out.println("O Aluno está "+resultadoFinal);
		
		double nota = 6.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "não";
		
		System.out.printf("Tem Desconto? %s", resultado);
		
		
		
		
		
	}

}
