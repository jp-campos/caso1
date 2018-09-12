package caso1;

public class Mensaje {

	
	private int contenido; 
	private int respuesta;
	private boolean enviado;
	
	
	
	public Mensaje (int pMensaje)
	{
		enviado = false;
		contenido = pMensaje; 
	}
	
	
	public synchronized void enviarMensaje()
	
	{
		try {
			enviado = true;
			wait();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		} 
	}
	

	public synchronized void mensajeRecibido()
	{
		notify(); 
	}
	
	public boolean enviado()
	{
		return enviado; 
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
