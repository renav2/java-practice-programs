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
public class pattern1_3 {
    public static void main(String args[]){
    int a=5;
    for(int i=0;i<5;i++){
   for(int j=0;j<i;j++){
       System.out.print(" -");
   }
   for(int k=4;k>i;k--){
       System.out.print(" &");
   }
        System.out.println("");
    }
    }
}
