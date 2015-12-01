package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<E> implements List<E>
{

	private int i;
	private E[] element;
	
	public ArrayList(int i, E[] element) 
	{
		this.i = i;
		this.element = element;
	}
	
	public void add (int i, E element)
	{
	}
	
	public E remove(int i)
	{
		return i;
		
	}
	
	public E get(int i)
	{
		return i;
	}
	
	public int size()
	{
		return 0;
	}

}
