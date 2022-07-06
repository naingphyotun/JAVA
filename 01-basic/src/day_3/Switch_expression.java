package day_3;

import java.util.Scanner;

public class Switch_expression {
	
    public static void main(String[]args) {
    	var sc = new Scanner(System.in);  	
    	System.out.print("Enter food name: ");   	
    	var name = sc.nextLine();
    	var category =
    			switch(name) {
    			case "burger", "pizza", "sandwich" -> "fast food";
    			case "milk tea", "yogurt"-> "Dessert";
    			case "mohinga"-> "Burmese Food";
    			case "sushi" -> "Japanese Food";
    			default -> "Unknown";
    			};
       System.out.println(name + " is " + category);
   }
}
