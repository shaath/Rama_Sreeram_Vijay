package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args) 
	{
		HashSet<String> s=new HashSet<>();

		s.add("Apple");
		s.add("Zebra");
		s.add("Rent");
		s.add("Boll");
		s.add("Apple");
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String data=it.next();
			System.out.println(data);
		}
	}

}
