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
public class even_oddindexprinyt {
 public static void main(String args[]){
 Scanner in=new Scanner (System.in);
     int a =in.nextInt();
     int b[]=new int[a];{
         for (int i = 0; i < a; i++) {
             b[i] = in.nextInt();

         } System.out.println("no");
for(int i=0;i<a;i++) {
   
    System.out.println(b[i]);
  
  
  }

for(int i=0;i<b.length;i++) {
   
    if(b[i]%2==0){
        System.out.println(b[i]+"even");
    }else{
        System.out.println("odd"+b[i]);
    }
  
  
  }


     }
 
 
 }   
}
