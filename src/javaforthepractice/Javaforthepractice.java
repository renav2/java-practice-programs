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
public class Javaforthepractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        int a;



do{
    System.out.println(" enter your no please");
    
     a=input.nextInt();
     
     System.out.println("if you want  to stop please  enter exit");
     
     String s="exit";
     String m=input.nextLine();
     if(s.equals(m)){
   
         System.out.println("have a grate day");
    break;
     }else {
     a=input.nextInt();
     }
     
    
    }
    while( a<100);
{
    
    System.err.println("your no is greter than 100 ");
   
    }
    
    
    }
    
}
