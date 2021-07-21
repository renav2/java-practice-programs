/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;
import java.util.*;

/**
 *
 * @author rvkul
 */
public class addition_of_single_dimensional_array {
    public static void main(String args[]){
    //for the addition of two array you need the same size of the array 
        Scanner in=new Scanner(System.in);
        System.out.println("enter  the size of the array");
        int a=in.nextInt();
        System.out.println("enter the elemnt of array "+" "+"A");
        int b[]=new int[a+1];
        {
        for(int i=0;i<a+1;i++){
        b[i]=in.nextInt();
        }
        }
            System.out.println("enter the element of array B");
           int c[]=new int[a+1];{
           for(int i=0;i<a+1;i++){
           c[i]=in.nextInt();
           }
        }
            System.out.println("your addition of the two arrays are");
           int d[]=new int [a+1];{
               
           for(int i=0;i<a+1;i++ ){
           d[i]=b[i]+c[i];
           System.out.println(" "+d[i]);
               }
            
        
        
        
        
        
        
        }
    
    
}
}