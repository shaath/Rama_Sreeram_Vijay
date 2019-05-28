package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		int[] x=new int[5];

		System.out.println(x.length);
		
		x[2]=4000;
		x[4]=60000;
		
//		x[5]=50000;
		
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
		
	}

}
