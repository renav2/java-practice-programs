/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaforthepractice.if_else.forloop;

import java.util.Scanner;

/**
 *
 * @author rvkul
 */
public class factorial_of_the_no {
   public static void main (String args[]){
   
       Scanner in=new Scanner(System.in);
     int fact=1;  
     int a=in.nextInt();
     
     for(int c=1;c<=a;c++){
     
     fact=fact*c;
     }
       System.out.println(fact);
     
   
   }   
   }
   