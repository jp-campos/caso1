package caso1;

import java.util.Random;

public class Cliente extends Thread{
	
	
	private Buffer buffer; 
	private int id;
	private Caso1 caso;
	
	public Cliente(Buffer pBuffer, Caso1 pCaso, int pId)
	{
		
		buffer = pBuffer; 
		id = pId; 
		caso = pCaso;
	}
	
	
	@Override
	public void run()
	{
		
		Random rand = new Random();
		int numMensajes = rand.nextInt(20-5)+5; 
		
		
		for (int i = 0; i < numMensajes; i++) {
			
			
			int contenido = rand.nextInt();
			Mensaje mensaje = new Mensaje(contenido);
			
			
			
			while(!buffer.hayEspacio())
			{
				yield();
			}
			
			System.out.println("El cliente con id " + id);
			
			buffer.agregar(mensaje);
			mensaje.enviarMensaje();
			
			
			
			}
		
		System.out.println("Salio el cliente id: " + id);
		caso.salioCliente();
		
	}
	

}
