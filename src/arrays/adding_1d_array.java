/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.*;
/**
 *
 * @author rvkul
 */
public class adding_1d_array {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
        System.out.println("enter the size of array");
        int a=in.nextInt();
        System.out.println("enter the element array A ");
        // intaialzie array 
      int A[]=new int [a+1];
      {//getting input from user
        for(int i=0;i<a+1;i++ )
           A[i]=in.nextInt();
        
            }
        System.out.println("enter the elemnt of the array of B");
      int B[]=new int[a+1];{
    for(int i=0;i<a+1;i++)
    B[i]=in.nextInt();
    
    }
        System.out.println("yor addition result is");
    
      int result[]=new int[a+1];{
    for(int i=0;i<a+1;i++){
    result[i]=A[i]+B[i]; 
        System.out.print(result[i]+" ");
    }
    
    }
      
    
    }
    
}
