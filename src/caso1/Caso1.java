package caso1;

public class Caso1 {

	private static Buffer buffer; 
	private Cliente cliente; 
	private Servidor servidor;
	
	
	
	public Caso1()
	{
		
		cliente = new Cliente(buffer);
		servidor = new Servidor(buffer);
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Caso1 caso = new Caso1(); 
		

	}

}
