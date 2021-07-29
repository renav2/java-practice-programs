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
public class reverse_string {
  public static void main(String args[] ){
  Scanner in =new Scanner (System.in);
  
  String abc=in.next();
  
  String rev=" ";
  //prasad
  for(int i=abc.length()-1;i>=0;i--){
  rev=rev+abc.charAt(i);
  
  }
      System.out.println(rev);
  
  } 
}
