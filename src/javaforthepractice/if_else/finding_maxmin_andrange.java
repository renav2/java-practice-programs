/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaforthepractice.if_else;

import java.util.*;

/**
 *
 * @author rvkul
 */
public class finding_maxmin_andrange {
    public static void main(String args[]){
        Scanner in=new Scanner (System.in);
        System.out.println("enter your  first  no "); 
        int a= in.nextInt();
        System.out.println(" enter your second no ");
        int b= in.nextInt();
        
        System.out.println("");  
        if(a>b){
            System.out.println(a+"is greter than "+b);
             if(a<10){
                System.out.println(" your no is lies between 0 to 10");
            }else if (a<5){
                System.out.println("your no is less than 5 ");
            }else if(a>5){
                System.out.println("your no is greter than 5 ");
            }
            else {
                System.out.println("your no is 5 ;)");
            }
            
            
        }
        else if(a==b){
            System.out.println("your first no and second no is same bro ;)");
        }
        
        else {
            System.out.println(b+"is greter than "+a);
        }
       
         
         
                
    
    }
    
}
