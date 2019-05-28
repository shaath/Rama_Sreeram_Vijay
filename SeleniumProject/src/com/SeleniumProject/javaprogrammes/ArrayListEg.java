package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<String> x=new ArrayList<String>();
		
		x.add("Apple");
		x.add("Selenium");
		x.add("Rama");
		x.add("Sreeram");
		x.add("Vijay");
//		x.add(2, "Sharath");
//		x.add(6, "Sample");
		x.set(1, "Sharat");
		
		
		System.out.println(x.size());
		
//		System.out.println(x.get(2));
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));			
		}
	}

}
