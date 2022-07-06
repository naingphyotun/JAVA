package day_3;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter foood name:");
    	String name = sc.nextLine();
    	String category;
    	switch(name){
    	case "burger","pizza","sandwich" :
    		category = "fast food";
    	    break;
    	case "yougurt","milk tea" :
    		category = "Dessert";
    	    break;
    	case "mohinga" :
    		category = "Burmese Food";
    	    break;
    	case "Sushi" :
    		category = "Japanese Food";
    	    break;
    	default:
    		category = "unknown";
    	}
    	System.out.println(name + " is " + category);
    	sc.close();
    }

}
