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
	
	
	
	
	public  synchronized void agregar(Mensaje m)
	{
		
	}
	
	
	public  synchronized void retirar()
	{
		
	}
	
	
	
}
