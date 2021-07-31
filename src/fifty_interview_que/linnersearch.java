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
public class linnersearch {
    public static void main(String args[]){
   Scanner in=new Scanner (System.in);
        System.out.println("entr size of the array");
   int a=in.nextInt();
        System.out.println("enter elemt in array");
   int arr[]=new int[a];{
        for(int i=0;i<a;i++){
           arr[i]=in.nextInt();
   }System.out.println("your array ");
        for(int i=0;i<a;i++){
            System.out.println(arr[i]);
   }
        System.out.println("enter the element which u want to search in array ");
        int temp=0;
        int elemnt=in.nextInt();
        for(int i=0;i<arr.length;i++){
        if(arr[i]==elemnt){
            System.out.println("elemt is present");
            break;
        }else{
            System.out.println("element is not presentin array");
            break;
        }
        
        }
       
        
    }
    
    
    }
}
