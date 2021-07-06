/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop;

/**
 *
 * @author rvkul
 */
public class pattern1 {
    public static void main(String args[]){
    for(int a=1;a<=5;a++ ){
        
        for(int b=1;b<=a;b++){
            System.out.print(" * ");
        }
        for(int c=5;c>=a;c--){
            System.out.print(" - ");
        }
        System.out.println("");
        
    }
    
    }
}
