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
public class dimanction_2array {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
        System.out.print("enter how many row :-" );
    int row=in.nextInt();
        System.out.print("enter how many collmn:-");
    int col=in.nextInt();
        System.out.print("enter the element  of the array");
   
        int arr[][]=new int[row+1][col+1];{
    for(int i=0;i<row+1;i++)
    {
    for(int j=0;j<col+1;j++){
    arr[i][j]=in.nextInt();
    }
     System.out.println("");    
    }
    
        System.out.println("your array is ");
     for(int i=0;i<row+1;i++)
    {
    for(int j=0;j<col+1;j++){
        System.out.print(arr[i][j]);
    }
     System.out.println("");    
    }
    
    
        
   }
    
   
        
        
        
    
    
    }
    
}
