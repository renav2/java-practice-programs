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
public class pattern1_8 {
    public static void main(String args[]){
     for(int i=1;i<=5;i++){
     for(int j=1;j<=i;j++){
        if( i>=2 && j<=i-1 ){
            System.out.print(" ");
        }else{
            System.out.print("*");
        }
     
     }
         System.out.println("");
     }
    
    
    
    }
}
