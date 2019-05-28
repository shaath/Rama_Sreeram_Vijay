package com.SeleniumProject.javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) 
	{
		String[][] x=new String[2][3];

		System.out.println("The number of rows "+x.length);
		System.out.println("The nuber of columns "+x[0].length);
		
		x[0][1]="Selenium";
		x[1][2]="UFT";
		
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
			}
		}
		
	}

}
