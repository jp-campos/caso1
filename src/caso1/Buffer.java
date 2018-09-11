package caso1;

import java.util.ArrayList;

public class Buffer {

	
	private ArrayList<Mensaje> buffer; 
	private int tamaño; 
	private int elementos; 
	
	
	public Buffer(int pTamaño)
	{
		tamaño = pTamaño; 
		elementos = 0; 
		
		
	}
	
	
	public int getElementos()
	{
		return elementos; 
	}
	
	
	public boolean hayEspacio()
	{
		return elementos < tamaño; 
	}
	
	
	public  synchronized void agregar(Mensaje m)
	{
		
		if(elementos < tamaño)
		{
			buffer.add(m);
			elementos++;
			
		}else
		{
			
		}
		
		
	}
	
	
	
	
	
	
	
	public synchronized Mensaje retirar()
	{
		elementos--; 	
		return buffer.remove(elementos-1);
	}
	
	
	
}
