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
public class multiply_two_2d_array {
    
    public static void fir(){
    Scanner in=new Scanner(System.in);
        System.out.println("enter the row");
    int row=in.nextInt();
        System.out.println("enter the colmn");
    int col=in.nextInt();
        System.out.println("enter the elemnt of the arry 1");
        int a[][] = new int[row + 1][col + 1];
        {
            for (int i = 0; i < row + 1; i++) {
                for (int j = 0; j < col + 1; j++) {
                    a[i][j] = in.nextInt();
                }
            }

        }
     System.out.print("enter the elemnt of the arry 2");
        int b[][] = new int[row + 1][col + 1];
        {
            for (int i = 0; i < row + 1; i++) {
                for (int j = 0; j < col + 1; j++) {
                    b[i][j] = in.nextInt();
                }
                System.out.println("");
            }

        }
     
        int c[][] = new int[row + 1][col + 1];
        {
            for (int i = 0; i < row + 1; i++) {
                for (int j = 0; j < col + 1; j++) {
                    for(int k=0;k<col+1;k++)
                    {
                                        c[i][j]+= a[i][k]*b[k][j];

                    }
                }
                System.out.println("");
            }

        }
        System.out.print("your array multiplication is");
        for (int i = 0; i < row + 1; i++) {
                for (int j = 0; j < col + 1; j++) {
                    System.out.println(c[i][j]);
                }
                System.out.println("");
            }
    
    
   
    
    }
    
     public static void main(String args[]){
    multiply_two_2d_array obj=new multiply_two_2d_array();
    obj.fir();
    }
    
}
