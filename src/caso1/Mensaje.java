package caso1;

public class Mensaje {

	
	private int contenido; 
	private int respuesta;
	
	
	
	
	public Mensaje (int pMensaje)
	{
		contenido = pMensaje; 
	}
	
	
	public synchronized void enviarMensaje()
	
	{
		try {
			wait();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		} 
	}
	

	public synchronized void mensajeRecibido()
	{
		notify(); 
	}
	
	
	public int darContenido()
	{
		return contenido; 
	}

	public int darRespuesta()
	{
		return respuesta; 
	}
	
	public void setRespuesta(int pRespuesta)
	{
		respuesta = pRespuesta;
	}
	
	
}
