package SwitchDemo;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		withArrow();
		
//String monthsInSeasons = args[0];
//		
//		
//		switch(monthsInSeasons){
//			case "december":	System.out.println();
//			case "january":		System.out.println();
//			case "february":	System.out.println("Winter");break;
//			case "march":		System.out.println();
//			case "april":		System.out.println();
//			case "may":			System.out.println("Spring");break;
//			case "june":		System.out.println();
//			case "july":		System.out.println();
//			case "august":		System.out.println("Summer");break;
//			case "september":	System.out.println();
//			case "october":		System.out.println();
//			case "november":	System.out.println("Autumn");break;
//			default : System.out.println("Please write between 1-12 names of months");
//		}
	
		

		 
	     
		


		
	}



	public static void withArrow() {
		
		 System.out.println("Month :");
	        Scanner scanner = new Scanner(System.in);
	        String[] tokens = scanner.nextLine().split(" ");
		String month = scanner.toString();
	     switch (month) {
	         case "december", "january","february" -> System.out.println("Winter");
	         case "march","april","may" -> System.out.println("Spring");
	         case "june","july","august" -> System.out.println("Summer");
	         case "september","october","november" -> System.out.println("Fall");
	         default -> System.out.println("Please write between 1-12 names of months");
	     }
		
	}
	
		

}
