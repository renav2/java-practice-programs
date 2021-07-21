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
public class pattern2 {
//54321-
//5432--
//543---
//54----
//5-----
    
   public static void main(String args[]){
   int a=5;
   //for rows
   for(int i=1;i<=a;i++){
   
   for(int j=a;j>=i;j--){
   
       System.out.print(j);
       
   }
  for(int k=1;k<=i;k++)
  {
      System.out.print("-");
  }
   System.out.println("");
   
   }
   
   
   }
}
