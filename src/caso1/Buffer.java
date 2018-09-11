package caso1;

import java.util.ArrayList;

public class Buffer {

	
	private ArrayList<Mensaje> buffer; 
	private int tama�o; 
	private int elementos; 
	
	
	public Buffer(int pTama�o)
	{
		tama�o = pTama�o; 
		elementos = 0; 
		
		
	}
	
	
	public int getElementos()
	{
		return elementos; 
	}
	
	
	public boolean hayEspacio()
	{
		return elementos < tama�o; 
	}
	
	
	public  synchronized void agregar(Mensaje m)
	{
		
		if(elementos < tama�o)
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
