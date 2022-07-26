package fundamentos;

public class Memoria {
	
	private static Memoria memoryInstance;
	private double quantidadeMemoria;
	private Memoria(){}
	public static Memoria getInstance() {
	if(memoryInstance == null) {
	memoryInstance = new Memoria();
	}
	return memoryInstance;
	}
	public double getQuantidadeMemoria() {
	return this.quantidadeMemoria;
	}
	public void setQuantidadeMemoria (float quantidadeMemoria) {
	this.quantidadeMemoria = quantidadeMemoria;
	}


	public static void main(String[] args){
	Memoria memoria2;  
	Memoria memoria1 =  Memoria.getInstance();
	memoria2 =  new Memoria();
	System.out.println(memoria1);
	}


}
