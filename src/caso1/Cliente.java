package caso1;

import java.util.Random;

public class Cliente extends Thread{
	
	
	private Buffer buffer; 
	private int id;
	
	public Cliente(Buffer pBuffer)
	{
		
		pBuffer = buffer; 
		id = 0; 
	}
	
	
	@Override
	public void run()
	{
		id++; 
		Random rand = new Random();
		int numMensajes = rand.nextInt(); 
		
		
		for (int i = 0; i < numMensajes; i++) {
			
			int contenido = rand.nextInt();
			Mensaje mensaje = new Mensaje(contenido);
			
			while(!buffer.hayEspacio())
			{
				yield();
			}
			
			buffer.agregar(mensaje);
			mensaje.enviarMensaje();
			
			
		}
		
		
	}
	

}
