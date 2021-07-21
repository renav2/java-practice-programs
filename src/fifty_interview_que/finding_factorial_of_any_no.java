/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;

import java.util.Scanner;





/**
 *
 * @author rvkul
 */
public class finding_factorial_of_any_no {
   //find the factorial of any no in java
    public static void main (String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no ");
        int a=in.nextInt();
       //we need one variable to store the result and multiply next no 
        int temp=1;
        for(int i=1;i<=a;i++){
        temp=temp*i;
        
        
        }
        System.out.println("factorial of "+a+" is "+temp);
    
    }
    
    
}
