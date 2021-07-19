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


public class reverse_sstring {    
public static void rev(){
Scanner in=new Scanner(System.in);
    System.out.println("enter the string ");
    String abc=in.next();
    
   // bcc
   String v=""; 
    for(int i=abc.length()-1;i>=0;i--){
    
    v=v+abc.charAt(i);
    }
    System.out.println("your revese string is ");
    System.out.println(v);
    
    
    
    
    
}
public static void main(String args[]){
  reverse_sstring obj=new reverse_sstring();
    obj.rev();

}

}
