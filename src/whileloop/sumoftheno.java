/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloop;

import java.util.Scanner;

/**
 *
 * @author rvkul
 */
public class sumoftheno {
    public static void main(String args[]){
    
  Scanner in=new Scanner(System.in);
  int a=in.nextInt();
  
  int temp=0;
  int rev;
  
  while(a!=0){
  rev=a%10;
  a/=10;
  temp +=rev;
  
  }
        System.out.println(temp);
  
    
    }
}
