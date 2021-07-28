/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;
import java.awt.BorderLayout;
import java.util.*;
/**
 *
 * @author rvkul
 */
public class largest {
    public static void main(String args[]){
    // largest no
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
        int b=in.nextInt();
            int c=in.nextInt();
    
    if(a>b &&a>c){
        System.out.println("a is largest no");
    
    }else if(b>a && b>c){
        System.out.println(" b is largest among the no");
    }else{
    
        System.out.println("c is greter no");
    }
    
    }
}
