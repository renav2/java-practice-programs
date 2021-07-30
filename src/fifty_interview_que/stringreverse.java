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
public class stringreverse {
    public static void main(String args[]){
        System.out.println("enter your string");
        Scanner in=new Scanner(System.in);
     String ss=in.next();
   
    char revers[]=ss.toCharArray();
     for(int i=ss.length()-1;i>=0;i--){
         System.out.print(revers[i]);
     }
     
    }
}
