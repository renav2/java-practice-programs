/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysorting_tech;
import java.util.*;
/**
 *
 * @author rvkul
 */
public class simple_assendingarray {
    public static void main(String args[]){
    Scanner in =new Scanner (System.in);
    
        System.out.println("enter the size of the array");
        int a=in.nextInt();
        System.out.println("enter the element in array");
        int b[]=new int [a+1];
        {
            for(int i=0;i<a+1;i++){
            b[i]=in.nextInt();
            }
            System.out.print("your array is :- ");
            for(int i=0;i<a+1;i++){
                System.out.print(" "+b[i]);
            }System.out.println(" ");
            
            int temp=0;
            for(int i=0;i<a+1;i++){
            for(int j=0;j<a+1;j++){
              if(b[i] < b[j]) {    
                   temp = b[i];    
                   b[i] = b[j];    
                   b[j] = temp;    
              }           
            }    
        }
    System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < b.length; i++) {     
            System.out.print(b[i] + " ");    
        }    
    
            
            
        }
    }
}
