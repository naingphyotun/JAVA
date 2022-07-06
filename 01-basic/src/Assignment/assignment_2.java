package Assignment;

import java.util.Scanner;

public class assignment_2 {
	
    
    // Function to count number of elements
    // occurs between the elements.
    static int getCount(int arr[], int n,
                            int num1, int num2)
    {
        // Find num1
        int i = 0;
        for (i = 0; i < n; i++)
            if (arr[i] == num1)
                break;
     
        // If num1 is not present
        // or present at end
        if (i >= n - 1)
            return 0;
     
        // Find num2
        int j;
        for (j = n - 1; j >= i + 1; j--)
            if (arr[j] == num2)
                break;
     
        // If num2 is not present
        if (j == i)
            return 0;
     
        // return number of elements
        // between the two elements.
        return (j - i - 1);
    }
     
    // Driver program
    public static void main (String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        int arr[] = { 7,8,9,10,11,12,1,2,3,4,5,6,7,8,9,10 };
        int n = arr.length;
        System.out.print("When do you go bed? : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("When do you go bed? : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println( getCount(arr, n, num1, num2 + 1));
        int sp = Integer.parseInt(sc.nextLine());
        if(sp >= 8 && sp <= 5) {
        	System.out.println("You take care your health well.");
        }else if(sp <= 5) {
        	System.out.println("You are hard working.");
        }else if(sp >= 8.1) {
        	System.out.println("You are lazy");
        }
 
    }




}
