package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<E> implements Stack<E>
{
	

	private int size;
	private E[] element;

	public ArrayStack(int size, E[] element) 
	{
		this.size = size;
		this.element = element;
	}
	
	public void push(E element)
	{
		this.size = this.size+1;
		this.element[size+1] = element;
		
	}
	
	public E pop()
	{
		this.size = this.size-1;
		return element[size];
	}
	
	public E peek()
	{
		return element[size-1];
	}

	public int size()
	{
		return size;
	}


}
