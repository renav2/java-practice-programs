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
public class single_dimensional {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
    int a=in.nextInt();
    
    int b[]=new int[a+1];
    for(int i=0;i<a+1;i++){
    b[i]=in.nextInt();
    }
    //print part simple
        System.out.println("normal array is");
    for(int i=0;i<a+1;i++){
        System.out.print(b[i]);
    }
        System.out.println("revrse array is ");
       for(int i=a;i>=0;i--){
        System.out.print(b[i]);
    } 
        
        
    }
}
