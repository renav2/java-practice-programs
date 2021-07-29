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
public class primeno_upto100 {
    public static void main(String args[]){
    
    int temp=0;
    
    for(int i=1;i<=100;i++){
       for(int j=2;j<i;j++){
       if(i%j==0){
       temp=temp+1;
       }
       
       }
    if(temp==0){
        System.out.println(i);
    }else{
        System.out.println(temp=0);
    }
    
    }
    
    
    }
}
