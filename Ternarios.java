package fundamentos;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		
		//String resultadoRecuperacao
		String resultadoFinal = media >= 7.0 ? "Aprovado." : "de Recupera��o.";
		System.out.println("O Aluno est� "+resultadoFinal);
		
		double nota = 6.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "n�o";
		
		System.out.printf("Tem Desconto? %s", resultado);
		
		
		
		
		
	}

}
