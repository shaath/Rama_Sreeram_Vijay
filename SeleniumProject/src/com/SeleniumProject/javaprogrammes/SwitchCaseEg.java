package com.SeleniumProject.javaprogrammes;

public class SwitchCaseEg {

	public static void main(String[] args) 
	{
//		String course="Selenium";
//
//		switch(course)
//		{
//		case "Manual":
//			System.out.println("You are selected Manual");
//			break;
//		case "Selenium":
//			System.out.println("You are selected Selenium");
//			break;
//		case "UFT":
//			System.out.println("You are selected UFT");
//			break;
//		default:
//			System.out.println("Select a proper course");
//			break;
//		}
		
		int day=5;
		
		switch (day) 
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednessday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Select a proper input");
			break;
		}
		
	}

}
