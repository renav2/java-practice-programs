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
public class simple_array_print {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int [] marks={1,2,3,4,5,6,7,8,9};
        System.out.println("simple"); 
for(int i=0;i<marks.length;i++){
    System.out.print(" "+marks[i]);
}
        System.out.println();       
System.out.println("reverce");
    for(int j=marks.length-1;j>0;j--){
        System.out.print(" "+marks[j]);
    }
    
    }
        
}
