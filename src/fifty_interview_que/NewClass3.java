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
public class NewClass3 {
    public static void main(String args[]){
    int count=0 ;
    
    for(int i=0;i<=5;i++){
    
        
        for(int j=0;j<=i;j++)
        {
        count =count+1;
            System.out.print(count);
        
        }
        System.out.println("");
    }
    // second pattern
    int count1 =5;
    for(int i=0;i<=5;i++){
    for(int j=5;j>=i;j--){
    
    count1 =count1-1; 
        System.out.print(count1);
    }
        System.out.println("");
    }
    
    
    }
}
