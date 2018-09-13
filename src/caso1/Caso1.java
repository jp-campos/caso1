package caso1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Caso1 {

	
	
	private static int numeroClientes;
	
	
	public Caso1()
	{
		ArrayList<Integer> mensajesCliente = new ArrayList<>(); 
		BufferedReader bufReader = null; 
		
		Buffer buffer;
		int tamañoBuffer = 0; 
		int numeroServidores = 0; 
		
		
		try {
			bufReader = new BufferedReader(new FileReader("data.txt") );
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
				
		try {
			String linea = bufReader.readLine();
			
			if(linea != null)
			{
			String [] partes1 = linea.split(",");
			
			numeroClientes = Integer.parseInt(partes1[0]);
			numeroServidores = Integer.parseInt(partes1[1]);
			tamañoBuffer = Integer.parseInt(partes1[2]);
		
			linea = bufReader.readLine(); 
			partes1 = linea.split(",");
			
			for (int i = 0; i < partes1.length; i++) {
				
				mensajesCliente.add(Integer.parseInt(partes1[i]));
			}
			
			
			
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Tamaño Buffer:" + tamañoBuffer);
		 buffer = new Buffer(tamañoBuffer);
		
		
		System.out.println("Numero de clientes: " + numeroClientes);
		System.out.println("Numero de servidores: " + numeroServidores);
		for (int i = 0; i <numeroClientes; i++) {
			
			Cliente cliente = new Cliente(buffer, this, i, mensajesCliente.get(i));
			
			cliente.start();
			
		}
		
		for (int i = 0; i < numeroServidores; i++) {
			Servidor servidor = new Servidor(buffer, this); 
			servidor.start();
			
		}
	}
	
	
	public synchronized void salioCliente()
	{
		numeroClientes--;
		System.out.println("Clientes: "  + numeroClientes);
	}
	
	
	public synchronized int getNumeroClientes()
	{
		return numeroClientes; 
	}
	
	public static void main(String[] args) {
		
		
		Caso1 caso = new Caso1(); 
		

	}

}
