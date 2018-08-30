package caso1;

public class Mensaje {

	
	private int mensaje; 
	
	
	
	public Mensaje (int pMensaje)
	{
		mensaje = pMensaje; 
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
	
	
}
