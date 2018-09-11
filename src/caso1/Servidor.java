package caso1;

public class Servidor extends Thread{

	private Buffer buffer;
	
	
	public Servidor(Buffer pBuffer)
	{
		
		buffer = pBuffer;
	}
	
	
	
	
	@Override
	public void run() {
		
		
		while(buffer.getElementos() > 0)
		{
			Mensaje m = buffer.retirar();
			int contenido = m.darContenido();
			m.setRespuesta(contenido++);
			m.mensajeRecibido();
			
			
		}
		
		
	}
	
	
	
	
	
}
