package com.SeleniumProject.javaprogrammes;

public class ForEg {

	public static void main(String[] args) 
	{
		//initialization; Condition ; Incrementor
		for(int i=1; i <= 10 ; i++)  // i=i+1
		{
			System.out.println("Hi");
			if (i == 6) 
			{
				break;
			}			
		}
		
		for (int i = 10; i >= 1; i--)  // i=i-1
		{
			System.out.println(i);
		}
		
	}

}
