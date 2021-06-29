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
public class incre {
    public static void main(String args[]){
    /*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/
        System.out.println("***welcome to account section****");
        Scanner in=new Scanner(System.in);
        System.out.println("enter emp exp");
        int exp=in.nextInt();
       
      
        System.out.println("enter emp salary  ");
    int sal=in.nextInt();
    
    
    if(exp>=5){
        System.out.println(" emp get 5% bonus ;) ");
        int  percent=5;
        int bonus=sal*percent/100;
        System.out.println(" you will  get extra  "+bonus+"in your sal");
        
        int total=sal+bonus;
        System.out.println("your total sal is "+total);
             
        ////////////hfdhgiuhgiudfihg/////////dfhguid
    }
    else{
        System.out.println("sry bro work hard  you need some experience ;)");
    }
    
    
    }
}
