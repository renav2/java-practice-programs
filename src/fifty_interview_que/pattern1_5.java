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
public class pattern1_5 {
    public static void main(String args[]){
    //pattern mirror
    for(int i=0;i<5;i++ ){
    for(int j=5; j>i;j--){
        System.out.print(" ");
    }
    for(int k=0;k<i;k++){
        System.out.print("*");
    }
        System.out.println("");
    }
    //second part 
    
    for(int i=0;i<5;i++){
    for(int j=0;j<i;j++){
        System.out.print(" ");
    }
    for(int k=5;k>i;k--){
        System.out.print("*");
    }
        System.out.println("");
    }
    
    
    }
}
