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
	
	//no se si synchronized
	public void mensajeRecibido()
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
