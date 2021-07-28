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
public class swaptwo_without {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
        System.out.println("ente year ");
    int a=in.nextInt();
        System.out.println("ent 2nd no");
    int b=in.nextInt();
    
        System.out.println("befor a="+a+"b="+b);
    a=a+b;
    b=a-b;
    a=a-b;
        System.out.println("after a="+a+"b="+b);     
    
    
    
    } 
}
