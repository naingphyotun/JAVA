package Assignment;

import java.util.Arrays;

public class Assignment_1 {
	
    public static void main(String[]args) {
    	int[] num = {100 , -1 , 100 , 0 , 50};
    	
    	//output
    	
    	for(var arr1 : num) {
    		System.out.println(arr1 + "\t");
    	}
		System.out.println("Number of 100: " + Arrays.binarySearch(num, 100));
		System.out.println("Number of -1: " + Math.abs(Arrays.binarySearch(num, -1)));
		System.out.println("Number of 50: " + Math.abs(Arrays.binarySearch(num, 50)));
    	
    	
    }

}
