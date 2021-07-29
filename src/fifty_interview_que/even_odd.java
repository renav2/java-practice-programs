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
public class even_odd {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
        System.out.println("enter the no");
    int a= in.nextInt();
    if(a==0){
        System.out.println("you enter 0 "); 
   }
    else  if(a%2==0){
        System.out.println("even no ");
    }
    
    else{
        System.out.println("odd no");
    }
    
    }
}
