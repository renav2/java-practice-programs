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
public class park_ticket {
    public static void main (String args[]){
        Scanner in=new Scanner (System.in);
        System.out.println("****Welcome to park****");
        System.out.println("plaese enter you age");
        int age=in.nextInt();
      
      if(age<18){
          System.out.println("you are not allow to going park");
      }else if(age>=18 && age<=20){
          System.out.println("your ticket cost is 18 rs ;) "); 
      }else{
          System.out.println("your ticket cost is 20 rs ");
      }
      
        System.out.println("****Enjoy your ride****");
    
    }
}
