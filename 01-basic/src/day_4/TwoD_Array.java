package day_4;

import java.util.Arrays;

public class TwoD_Array {
    public static void main(String[]args) {
    	int [][] marks = {
    			{60 , 70 , 40 , 70 , 80},
    			{90 , 50 , 60 , 30 , 50},
    			{50 , 60 , 70 , 80 , 70}
    	}; 
    	String[] names = {"Jeon","Yuri","Cherry"};
    	//out put
    	for(var r = 0; r < 3; r++) {
    		for(var c = 0; c < 5; c++) {
    			System.out.print(marks[r][c] + "\t");
    		}
    		System.out.println();
    	}
    	
		System.out.println("------ for each -----");
		for(int[] row : marks) {
			for(int col : row) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(marks));
		
		int row = marks.length;
		int col = marks[0].length;
		for(var i = 0; i < row ; i++) {
			var total = 0;
			for(var j = 0; j < col ; j++) {
				total += marks[i][j];
			}
			
			System.out.println("The total marks obtain by " + names[i] + " is " + total);
			System.out.println("The average marks of " + names[i] + " is " + (float)total/5);
			System.out.println("---------------------------");
		}
    }
}
