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
public class twoD_arraymulti {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int c=in.nextInt();
    //first array
        int b[][] = new int[a][c];
        {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < c; j++) {

                    b[i][j] = in.nextInt();
                }

            }

        }
    //second arry
        System.out.println("second array ");
        
        int d[][] = new int[a][c];
        {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < c; j++) {

                    d[i][j] = in.nextInt();
                }

            }

        }
        //result 
        System.out.println("result");
            int e[][] = new int[a][c];
        {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < c; j++) {
                       for(int k=0;k<c;k++){
                       e[i][j]+=b[i][k]*d[k][j]; 
                       
                       }      
     System.out.print(e[i][j]+" ");

                    
                    
                   
                }

            }

        }
        
        
        
    
    }
}
