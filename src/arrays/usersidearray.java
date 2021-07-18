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
public class usersidearray {
public static void main (String args[]){
int a;
Scanner in= new Scanner(System.in);
    System.out.println("enter lenth of array");
     a=in.nextInt();
    System.out.println("enter your array element");
    int []b= new int [a+1];{
    
        for(int i=0; i<a+1; i++)
        {
           b[i] = in.nextInt();
        }   
        System.out.print("Elements in Array are :\n");
        for(int i=0; i<a+1; i++)
        {
           System.out.print(b[i] + "  ");
        }  


}
//int len;
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Array length : ");
//	len=sc.nextInt();
//	int a[]=new int[len];//declaration    	 
//	
}    
}
