package com.SeleniumProject.javaprogrammes;

public class ReuseEg {

	public static void main(String[] args) 
	{
//		MethodsEg.Function1();
		MethodsEg m=new MethodsEg();
		
		int res=m.sum(50,60,40);
		System.out.println(res);
		
	}

}
