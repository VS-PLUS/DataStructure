package com.mapimplementation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class MyMap<K,V> {

	private int size;
	private int DEFAULT_CAPACITY=16;
	private MyEntry<K, V>[] values=new MyEntry[DEFAULT_CAPACITY];
	
	public V get(K key)
	{
		for(int i=0;i<size;i++)
		{
			if(null!=values[i] )
			{
				if(values[i].getKey().equals(key))
				{
					return values[i].getValue();
				}
			}
		}
		
		return null;
	}
	
	public void put(K key, V value)
	{
		boolean insert=true;
		for(int i=0;i<size;i++)
		{
			if(null!=values[i])
			{
				if(values[i].getKey().equals(key))
				{
					values[i].setValue(value);
					insert=false;
				}
			}
		}
		if(insert)
		{
			ensureSize();
			values[size++]=new MyEntry<K, V>(key, value);
		}
	}
	
	public void ensureSize()
	{
		if(values.length==size)
		{
			values=Arrays.copyOf(values, size*2);
		}
	}
	public int size()
	{
		return size;
	}
	public void remove(K key)
	{
		for(int i=0;i<size;i++)
		{
			if(null!=values[i])
			{
				if(values[i].getKey().equals(key))
				{
					values[i]=null;
					size--;
					condenseArray(i);
				}
			}
		}
	}
	
	public void condenseArray(int start)
	{
		for(int i=start;i<size;i++)
		{
			values[i]=values[i+1];
		}
	}
	
	
	public Set<K> keySet()
	{
		Set<K> s=new HashSet<K>();
		for(int i=0;i<size;i++)
		{
			if(null!=values[i])
			{
				s.add(values[i].getKey());
			}
		}
		return s;
	}

	
}
