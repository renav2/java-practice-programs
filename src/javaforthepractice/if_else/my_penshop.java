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
public class my_penshop {
    public static void main(String args[]){
        System.out.println("*****welcome to pen shop envery pen is 50 rs*****");
    
        int amount=50;
        
        
        Scanner in=new Scanner (System.in);
        System.out.println("enter the queantity");
        int  quant=in.nextInt();
        
        int  total=amount*quant;
        
        if(total>=1000){
            System.out.println(" hurrayyyyyyyy !!!you got  discount 10 %!!!!!");
            int off=10;
         int desc=(total*off/100);
            System.out.println(" you save  amount is"+desc);
            float last=total-desc;
            System.out.println("your final amount is " +last);
         
         
        }
        else{
            
            System.out.println(" **you are not eligibale for the discount** \n for the discount you need to purches total 1000 ;)  ");
            System.out.println(" your total cost is : "+total);
        }
        
        
        
    }
}
