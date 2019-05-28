package com.SeleniumProject.javaprogrammes;

public class NestedIFEg {

	public static void main(String[] args) 
	{
		int a=30;
		int b=30;
		int c=10;
		
		if(a > b & a > c)
		{
			System.out.println("A is greater");
		}
		else if(b > c & b > a)
		{
			System.out.println("B is Greater");
		}
		else if(c > a & c > b)
		{
			System.out.println("C is greater");
		}
		else
		{
			System.out.println("Give proper inputs");
		}

	}

}
