package day_6;

import java.util.Scanner;

public class exception_handing_1 {


	public static void main(String[]args) {
    	try {
    		//Display = 100;
    		Scanner sc = new Scanner (System.in);
    		System.out.println("Enter a number 1 : ");
    		int num1 = Integer.parseInt(sc.nextLine());
    		System.out.println("Enter a number 2 : ");
    		int num2 = Integer.parseInt(sc.nextLine());
    		
    		var result = num1 / num2;
    		System.out.println("result : " + result);
    		sc.close();
    	}
    	catch(ArithmeticException obj1) {
    		System.err.println("Divisor must not be zero");
    	}
    	catch(NumberFormatException obj2) {
    		System.err.println("User input must not be a number");
    	}
    	catch(Exception obj3) {
    		System.err.println(obj3.getMessage());
    	}
    }

}
