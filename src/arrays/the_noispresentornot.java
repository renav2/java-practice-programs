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
   public void the_game(){
        int[]arr={1,2,3,5,6,7,8,9};
        for(int j=0;j<arr.length;j++){
            System.out.println("your array is"+" "+arr[j]);
        }
 Scanner in=new Scanner (System.in);
       System.out.println("enter the no wich u wan be search");
 int a=in.nextInt();
 
     for(int i=0;i<arr.length;i++){
  
 if(a==arr[i]){
     this_show();
    
 }
 else{
     this_show2();
 }
 }
    
    
    }
       private void this_show() {
             System.out.println("your no is present");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
    }
     private void this_show2() {
         System.out.println("your no is not present");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
 public static void main(String args[]){
 
the_noispresentornot obj=new  the_noispresentornot();
 
obj.the_game();
 }   

 
    
}
