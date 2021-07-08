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
public class palindromno {
  public static void main(String args[]){
      Scanner in=new Scanner(System.in);
  int a=in.nextInt();
  int aa =a;
  int rev=0,rem;
  while(aa!=0){
 rem=aa%10;
 rev=rev*10+rem;
      aa=aa/10;
  }
      System.out.println(rev);
      
      if(a==rev){
          System.out.println("your no is palindrom");
      }
      else{
          System.out.println("not apalindrom");
      }
      
      
  }  
}
