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
public class multiplication_of_single_dimensional_array {
    public static void main(String args[]){
Scanner in=new Scanner(System.in);
 //int take
System.out.println("enter the size of array");
    int a=in.nextInt();
        System.out.print("enter the elemnt of the array");
        int b[] = new int[a + 1];
        {

            for (int i = 0; i < a + 1; i++) {
                b[i] = in.nextInt();
            }

        }
        System.out.println("entr the second array");
             int c[] = new int[a + 1];
        {

            for (int i = 0; i < a + 1; i++) {
                c[i] = in.nextInt();
            }

        }
           // System.out.println("multiplication of  array is");
             int result[] = new int[a + 1];
        {

            for (int i = 0; i < a + 1; i++) {
                result[i] = b[i]*c[i];
            }

        }
            
       
        System.out.println("result is");
            for (int i = 0; i < a + 1; i++) {
                System.out.println(result[i]);
            }

        
            
            
            
            
            
    }
    
}
