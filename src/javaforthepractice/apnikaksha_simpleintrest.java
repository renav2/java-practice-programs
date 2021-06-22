/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaforthepractice;

import java.util.Scanner;

/**
 *
 * @author rvkul
 */
public class apnikaksha_simpleintrest {
    // formula for simple intrest is 
    //si=(p*r*t)/100
    
    public static void main(String[] args) {
        
    
   
    float si;
    Scanner input=new Scanner(System.in);
        System.out.println("******finding simple intrest********");
        
        System.out.println("enter principle amount");
    int p = input.nextInt();
        System.out.println("Enter rate of intrest");
    float r= input.nextFloat();
        System.out.println("Enter the time in year");
    float t= input.nextFloat();
    
    si=((p*r*t)/100);
    
        System.out.println("your simple intrest is :  " +si);
    
    }
    
}
