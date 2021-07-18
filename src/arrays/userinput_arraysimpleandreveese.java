/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author rvkul
 */
public class userinput_arraysimpleandreveese {
    public static void main(String args[]){
 System.out.println("enter your size of the array");
        Scanner in= new Scanner(System.in);
 int a= in.nextInt();
       
 int arr[]=new int[a+1];
 {
 for(int i=0;i<a+1;i++){
 arr[i]=in.nextInt();
 
 }
 //printing srall
     System.out.println(" your array is :-");
 for(int i=0;i<a+1;i++){
     System.out.print(" "+ arr[i]);
 }
 
 // printing ult
     System.out.println("");
     System.out.println("your riverse array is  ");
     for(int j=arr.length-1;j>=0;j--){
         System.out.print(" "+arr[j]);
     }
     System.out.println("");
 
 
 }
    }
}
