/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;

/**
 *
 * @author rvkul
 */
public class no_pattern {
 public static void main(String args[]){
 
 for(int i=0;i<5;i++){
     
     int count = 1 ;
 for( int j=0;j<=i;j++){
     count =count+ 1;
     System.out.print(count++);
         
 }
     System.out.println();
 }
 
 }   
}
