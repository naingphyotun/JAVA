package day_2;

import java.util.Scanner;

public class Constvaeiable {
	
	static final float RARE = 2.5f;
	static final int MIN_PRICE = 1000;
	
    public static void main(String[]args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter price: ");
    	int price = sc.nextInt();
    	if(price <MIN_PRICE) {
    		price = MIN_PRICE;
    	}
    	
    	System.out.println("Price: " + price);
    	System.out.println("Expense: " + price * RARE);
    	
    }

}
