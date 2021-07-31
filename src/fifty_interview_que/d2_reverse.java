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
public class d2_reverse {
    public static void main(String args[]){
        System.out.println("enter how many row u want ");
            Scanner in=new Scanner(System.in);
            int a=in.nextInt();
        System.out.println("enter how many colmn u want");
    int b=in.nextInt();
        System.out.println("your dimension for the matrix is"+a+"*"+b); 
           System.out.println("enter the elemnt in array"); 
                   
        //for the row
        int c[][]=new int[a][b];
        {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    c[i][j] = in.nextInt();

                }

            }
            System.out.println("your 2D array is ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(c[i][j]+" ");

                }System.out.println("");

            }
            
            
            
        }
        
        
    
    
    
    
    }
}
