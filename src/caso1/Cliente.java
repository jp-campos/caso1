package caso1;

import java.util.Random;

public class Cliente extends Thread{
	
	
	private Buffer buffer; 
	private int id;
	private Caso1 caso;
	private int numeroMensajes;
	
	public Cliente(Buffer pBuffer, Caso1 pCaso, int pId, int pNumeroMensajes)
	{
		numeroMensajes = pNumeroMensajes; 
		buffer = pBuffer; 
		id = pId; 
		caso = pCaso;
	}
	
	
	@Override
	public void run()
	{
		
		Random rand = new Random();
		
		System.out.println("Numero Mensajes cliente " + id +": " + numeroMensajes);
		
		for (int i = 0; i < numeroMensajes; i++) {
			
			
			int contenido = rand.nextInt();
			Mensaje mensaje = new Mensaje(contenido);
			
			
			
			while(!buffer.hayEspacio())
			{
				System.out.println("El while");
				yield();
			}
			
			
			
			buffer.agregar(mensaje);
			mensaje.enviarMensaje();
			
			System.out.println("Respuesta recibida : \n Mensaje: " + mensaje.darContenido() + "\n Respuesta: " + mensaje.darRespuesta() );
			
			}
		
		System.out.println("Salio el cliente id: " + id);
		caso.salioCliente();
		
	}
	

}