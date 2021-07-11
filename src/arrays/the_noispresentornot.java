/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.*;

/**
 *
 * @author rvkul
 */
public class the_noispresentornot {
 public static void main(String args[]){
 int[]arr={1,2,3,5,6,7,8,9};
 Scanner in=new Scanner (System.in);
 int a=in.nextInt();
 
 for(int i=0;i<arr.length;i++){
  
 if(a==i){
     System.out.println("your number is present");
    
 }else{
     System.out.println("no is not present in the array"+arr[i]);
 }
 }
 
 
 }   
}
