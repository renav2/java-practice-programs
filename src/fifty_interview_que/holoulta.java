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
public class holoulta {
    public static void main(String args[]){
        //first part
//        for (int i = 0; i <= 5; i++) {
//
//            for (int j = 4; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= (i * 2); k++) {
//                if (k >= 1 && k <= (i * 2) - 1) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println("");
//
//        }
        // second part
        for (int i = 5; i>= 1; i--) {
            for(int j=i;j>i;j--){
                System.out.print(" ");
            }
           
            for(int k=1;k<(i*2);k++){
               if(k>1 && k<(i*2)-1 ){
                   System.out.print(" ");
               }else{
                   System.out.print("*");
               }
            
            }System.out.println(" ");
            
            
            
        }
    
    
    }
}
