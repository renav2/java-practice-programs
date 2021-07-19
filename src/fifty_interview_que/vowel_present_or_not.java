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
public class vowel_present_or_not {
    public static void vovo(){
    Scanner in=new Scanner (System.in);
    String abc=in.next();
    String temp=" ";
    for(int i=0;i<abc.length();i++){
    if(abc.charAt(i) == 'a'|| abc.charAt(i) == 'e'|| abc.charAt(i) == 'i' || abc.charAt(i) == 'o' || abc.charAt(i) == 'u') {
            System.out.println("vowel is present");
break;
         }
    else{
        System.out.println("vowels are not present");
        break;
    }
   
    }
    
        
       
    }
    public static void main (String args[]){
    
    vowel_present_or_not obj=new vowel_present_or_not();
    obj.vovo();
    
    }
}
