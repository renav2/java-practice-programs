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
public class pattern2 {

    public static void main(String args[]) {
        //first for loop for the line 
        for (int a = 1; a <= 5; a++) {
        //this for loop for the * pattern only 
            // in first line we have 5 star  then it will be decresing 

            for (int b = 5; b >= a; b--) {
                System.out.print(" * ");
            }
        //this for looop for the -
            // in the first row their is only one -  and then it going to increase

            for (int c = 1; c <= a; c++) {
                System.out.print(" - ");
            }
            System.out.println("");

        }

    }
}
