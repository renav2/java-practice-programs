/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;

/**
 *
 * @author rvkul
 */class ab{
 
     public ab(int a, int b){
     int c=a+b;
         System.out.println(c);
     }
 
public ab(double a,double b){
double  d= a+b;
    System.out.println(d);
}   
 
 }
public class constructor_overloding {
    public static void main(String args[]){
    ab obj=new ab(5.4,4.6); 
        
        
    }
}
