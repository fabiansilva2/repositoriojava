package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		
		//double a = 2.3;
		String s = "bom dia x ";
		
		s = s.replace("x", "senhora");
		s = s.toUpperCase();
		
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia x"
				.replace("x", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		
		int a = 3;
		System.out.println(a);
		
		
	}

}
