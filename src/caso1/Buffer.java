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
			//elemtos++
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
		//Si no hay elementos o aun el mensaje no se ha enviado return null
		//Por no enviado se refiere a que no se ha dormido el cliente
		if(elementos == 0||!buffer.get(elementos-1).enviado() )
		{
			return null; 
		}
		//elementos ++
		sumarRestar(-1);	
		//quita el �ltimo elemeto del arreglo
		return buffer.remove(elementos);
	}
	
	
	
}
