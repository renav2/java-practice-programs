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
public class holo_tringle {
    public static void main(String args[]){
    for(int i=1;i<=5;i++){
    for(int k=5;k>=i;k--){
        System.out.print(" ");
    }
        
        
        for(int j=1;j<(i*2);j++){
        if(j>1 && j<(i*2)-1){
            System.out.print(" ");
        }
        else{
            System.out.print("*");
        }
    }System.out.println("");
    }
    
    }
}
