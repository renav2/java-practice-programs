/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;

import java.util.Scanner;

/**
 *
 * @author rvkul
 */
public class NewClass2 {
 static void countSquares(int arr[], int N)
{
   
    // Stores the required count
    int count = 0;
 
    // Traverse the array
    for (int i = 0; i < N; i++)
    {
 
        // Square of the element
        int square = arr[i] * arr[i];
 
        // Traverse the array
        for (int j = 0; j < N; j++)
        {
 
            // Check whether the value
            // is equal to square
            if (arr[j] == square)
            {
 
                // Increment count
                count = count + 1;
            }
        }
    }
 
    // Print the count
    System.out.println("your count is");
    System.out.println(count);
}
 
// Driver Code
public static void main(String[] args)
{
   Scanner in=new Scanner(System.in);
    // Given array
  
    System.out.println("size");
     int N=in.nextInt();
    int arr[] = new int[N];
    System.out.println("enter the elemt"); 
   for(int i=0;i<N;i++){
    arr[i]=in.nextInt();
    }
 
    // Size of the array
   
    countSquares(arr, N);
}
}   
    
    

