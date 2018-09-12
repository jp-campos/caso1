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
		buffer = new ArrayList<>(); 
		
		
	}
	
	
	public int getElementos()
	{
		return elementos; 
	}
	
	
	public synchronized boolean hayEspacio()
	{
		return buffer.size() < tama�o; 
	}
	
	
	public  synchronized void agregar(Mensaje m)
	{
		
			
			buffer.add(m);
			sumarRestar(1);

		
	}
	
	
	public synchronized void sumarRestar(int sumaResta)
	{
		if(sumaResta > 0)
		{
			elementos++; 
		}else
		{
			elementos--;
		}
		
	}
	
	
	
	
	public synchronized Mensaje retirar()
	{
		//System.out.println(elementos+ " - " +buffer.size());
		if(elementos == 0)
		{
			return null; 
		}
	
		sumarRestar(-1);	
		return buffer.remove(elementos);
	}
	
	
	
}
