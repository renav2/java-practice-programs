/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;
import java.util.*;

/**
 *
 * @author rvkul
 */
public class calculator_usingswitch {
   public static void main(String args[]){
   Scanner in=new Scanner(System.in);
       System.out.println(" ente first no");
   int a=in.nextInt();
       System.out.println("enter second no");
   int b=in.nextInt();
       System.out.println("*****menu*****");
       System.out.println("press 1 for addition");
        System.out.println("press 2 for multiplication");
         System.out.println("press 3 for div");
          System.out.println("press 4 for sub");
       System.out.println("press 5 for exit");
          
       int key = in.nextInt();

       

       switch (key) {
           case 1:
               int c = a + b;
               System.out.println("addition of" + a + "+" + b + " = " + c);
               break;

           case 2:
               int d = a * b;
               System.out.println("mul of" + a + "*" + b + " = " + d);
               break;

           case 3:
               int e = a / b;
               System.out.println("addition of" + a + "/" + b + " = " + e);
               break;

           case 4:
               int f = a - b;
               System.out.println("addition of" + a + "+" + b + " = " + f);
               break;
       }

   
   
   } 
}
