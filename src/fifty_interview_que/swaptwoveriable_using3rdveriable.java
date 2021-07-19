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
public class swaptwoveriable_using3rdveriable {
  
    public static void sw(){
    Scanner in=new Scanner(System.in);
        System.out.println("enter the value of a");
    int a=in.nextInt();
        System.out.println("enter the value of b");
    int b=in.nextInt();
    
        System.out.println("your value of a= "+a+"your value of b= "+b);
    b=b+a;
    a=b-a;
    b=b-a;
    
        System.out.println("value of A="+a+"value of B="+b);
    
    
    
    
    }
    public static void main(String args[]){
    swaptwoveriable_using3rdveriable obj=new swaptwoveriable_using3rdveriable();
    obj.sw();
    
    
    }
    
    
    
    
}
