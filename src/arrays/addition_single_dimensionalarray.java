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
public class addition_single_dimensionalarray {

    public static void main(String args[]){
        System.out.println("enter your array lenth");
        Scanner in=new Scanner(System.in);
        
int a=in.nextInt();
System.out.println("enter your array element ");
int []b=new int[a+1];{
int temp=0;

for(int i=0;i<a+1;i++){
b[i]=in.nextInt();

}for(int i=0;i<a+1;i++){
temp +=b[i];
}
        System.out.println("your array sum is "+temp);
    
    
    
    
    
    
    
    
    
    
    }



}
}
