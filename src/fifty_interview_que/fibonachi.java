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
public class fibonachi {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
        System.out.println("enter the last no of febonachi series");
    int a=in.nextInt();
    int no,prev = 0,next = 1;
   for(int i=0;i<=a;i++){
   no=prev+next;
       System.out.println(no);
   prev=next;
   next=no;
   }
        
   
    
    
    }
}
