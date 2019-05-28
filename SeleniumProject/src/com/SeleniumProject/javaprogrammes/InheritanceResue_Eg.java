package com.SeleniumProject.javaprogrammes;

public class InheritanceResue_Eg extends MethodsEg
{

	public static void main(String[] args) 
	{
		Function1();
		
		MethodsEg m=new MethodsEg();		
		m.Function1();
				
//		int res=m.sum(20, 30);
//		System.out.println(res);
		
	}
	
	public static void Function1()
	{
		System.out.println("This is Child class Function1 code");
	}
	
}
