package caso1;

public class Servidor extends Thread{

	private Buffer buffer;
	private Caso1 caso;
	
	public Servidor(Buffer pBuffer, Caso1 pCaso)
	{
		
		buffer = pBuffer;
		caso = pCaso; 
	}
	
	
	
	
	@Override
	public void run() {
		
		
		while(caso.getNumeroClientes() > 0)
		{
			
			
			Mensaje m = buffer.retirar();
			
			//Si si hay un mensaje que se pueda procesar
			if(m!= null)
			{	
				
			int contenido = m.darContenido();
			m.setRespuesta(contenido++);
			//despierta al cliente
			m.mensajeRecibido();
			}
			
		}
		
		
		
		
	}
	
	
	
	
	
}
