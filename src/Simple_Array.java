/*
public class Simple_Array {
    public static void main(String[] args) {
        //int n[]=new int[10];
        int n[]={1,2,3,4,5,6,6,7,8,9};
        for(int i=0;i< n.length;i++)
        {
            System.out.print(i);
            System.out.print("\n");
        }
    }
}

import java.util.*;
public class Simple_Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n[]=new int[6];

        for(int i=n.length-1;i>=0;i--)
        {
            System.out.print(i);
            System.out.print("\n");
        }
       // int n[]=new int[6];
    }
}

import java.util.Scanner;

public class Simple_Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numberOfNames = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt()

        // Declare an array to store the names
        String[] names = new String[numberOfNames];

        // Get names from the user
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = input.nextLine();
        }

        // Print the names
        System.out.println("You entered the following names:");
        for (int i = 0; i < numberOfNames; i++) {
            System.out.println(names[i]);
        }

        // Close the scanner
        input.close();
    }
}
 */
public class Simple_Array {

    public static void main(String[] args) {
        // Declare and initialize a 2D array (matrix)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Access and print elements of the 2D array
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}

