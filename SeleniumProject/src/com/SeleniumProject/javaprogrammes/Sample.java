package com.SeleniumProject.javaprogrammes;

public class Sample {

	public static void main(String[] args) 
	{
		InterfaceEg imp=new InterfaceEgImplementsEg1();
		
		imp.Vehicle();
		imp.Ship();
		imp.Flight();
		
		InterfaceEg imp1=new InterfaceImplementsEg2();
		
		imp1.Vehicle();
		imp1.Ship();
		imp1.Flight();
					
	}

}
