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
public class pattern1_9 {
    public static void main(String args[]){
    for(int i=0;i<5;i++){
    for(int j=0;j<i;j++){
        System.out.print(" ");
    
    }for(int k=5;k>i;k--){
    if(k<=4){
        System.out.print("");
    }else{
        System.out.print("*");
    }
    }
        System.out.println("");
    }
    
    
    }
}
