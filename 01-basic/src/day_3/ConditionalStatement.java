package day_3;

import java.util.Scanner;

public class ConditionalStatement {
	

	public static void main(String[]args) {
    	// if statement
    	Scanner sc = new Scanner(System.in);
//    	System.out.print("Enter Langue: ");
//    	String lang = sc.nextLine();
//    	
//    	if(lang.equalsIgnoreCase("Java")) {
//    		System.out.println("Best programing Langue");
//    	}
    	
    	//if else statement
//    	System.out.println("-----if else-----");
//    	System.out.print("Enter Email: ");
//    	String email = sc.nextLine();
//    	System.out.print("Enter password: ");
//    	String pass = sc.nextLine();
//    	
//    	if(email.equals("abc@gmail.com") && pass.equals("123")) {
//    		System.out.println("Log in");
//    	}else {
//    		System.err.println("Fail Log in");
//    	}
//    	
    	//If else if statement
    	System.out.println("-----if else if-----");
    	System.out.print("Enter Your BMI Value: ");
    	float bmi = sc.nextFloat();
    	
    	if(bmi < 18.5) {
    		System.out.println("Under Weight");
    	}
    	
    	else if(bmi >= 18.5 && bmi<= 24.9) {
    		System.out.println("Normal Weight");
    	}
    	
    	if(bmi >= 25 && bmi <= 29.9) {
    		System.out.println("Over Weight");
    	}
    	else {
    		System.out.println("Obesity");
    	}
    	
    	sc.close();
    }

}
