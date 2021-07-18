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
public class array3 {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
   
        System.out.println("enter the  size if the array");
         int a=in.nextInt();
         
         int arr[]=new int[a];
         for(int i=0;i<arr.length;i++){
             arr[i]=in.nextInt();
         }
         
         int b=in.nextInt();
         arr[a]=b;
         
         for(int j=0;j<=a;j++){
             System.out.println(arr[j]);
         }
       
                 
         System.out.println(arr[a]);
    }
    
}
