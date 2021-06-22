/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaforthepractice.if_else;

import java.util.Scanner;

/**
 *
 * @author rvkul
 */
public class find_macno_amoungus {
    public static void main (String args[]){
        Scanner in=new Scanner(System.in);
        
   //for size 
        
        System.out.println("enter the size");
        int a=in.nextInt() ;
         int actual = 1;
       
        
    
                // for intialization
        for(int c=actual;c<=a;c++){
        
             System.out.println("enter the next no");
         actual=in.nextInt();
           
         
        }
         System.out.println("your no is "+actual+" ");
    
    }
}
