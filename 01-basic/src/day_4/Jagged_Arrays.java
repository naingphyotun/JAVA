package day_4;

import java.util.Arrays;

public class Jagged_Arrays {
	
	
    public static void main(String[]args) {
    	
    	int[][] data = {
    			{1,2,3},
    			{1,2,3,4},
    			{1,2}
    	};
    	
    	System.out.println("----- for loop ------");
    	for(var i = 0; i < data.length ; i++) {
    		for(var j = 0; j < data[i].length; j++) {
    			System.out.print(data[i][j] + "\t");
    		}
    		System.out.println();
    	}
    	
    	System.out.println("----- for each loop ------");
    	for(var row : data) {
    		for(var col : row) {
    			System.out.print(col + "\t");
    		}
    		System.out.println();
    	}
    	
    	System.out.println(Arrays.deepToString(data));
    }

}
