/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;

/**
 *
 * @author rvkul
 */
public class pattern_1 {
    public static void main(String args[]){
    int a=5;
    //row
    for(int i=0;i<a;i++){
    //col
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        
     System.out.println("");
    }
       
        
    }
}
