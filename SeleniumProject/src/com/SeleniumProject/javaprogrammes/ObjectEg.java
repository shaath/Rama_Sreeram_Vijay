package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] x={20000,"Selenium",'M',444.44,true};
		
		System.out.println(x.length);
		
//		for (int i = 0; i < x.length; i++) 
//		{
//			System.out.println(x[i]);
//		}
		for (Object data : x) 
		{
			System.out.println(data);
		}

	}

}
