package caso1;

import java.util.Random;

public class Caso1 {

	
	
	private static int numeroClientes;
	
	
	public Caso1()
	{
		Buffer buffer = new Buffer(10);
		
		
		numeroClientes = new Random().nextInt(20-1)+1;
		int numServidores = new Random().nextInt(20-2)+2;
		
		System.out.println("Numero de clientes: " + numeroClientes);
		for (int i = 0; i <numeroClientes; i++) {
			
			Cliente cliente = new Cliente(buffer, this, i);
			
			
			cliente.start();
			
		}
		
		for (int i = 0; i < numServidores; i++) {
			Servidor servidor = new Servidor(buffer, this); 
			servidor.start();
			
		}
	}
	
	
	public synchronized void salioCliente()
	{
		numeroClientes--;
		System.out.println("Salio un cliente, num Clientes: "  + numeroClientes);
	}
	
	
	public synchronized int getNumeroClientes()
	{
		return numeroClientes; 
	}
	
	public static void main(String[] args) {
		
		
		Caso1 caso = new Caso1(); 
		

	}

}
