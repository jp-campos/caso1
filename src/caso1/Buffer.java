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
	
	
	
	
	public  synchronized void agregar(Mensaje m)
	{
		
	}
	
	
	public  synchronized void retirar()
	{
		
	}
	
	
	
}
