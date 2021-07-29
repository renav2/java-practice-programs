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
public class pattern1_4 {
  public static void main(String args[]){
  //row
      for (int i = 0; i <= 5; i++) {
          for (int j = 0; j < i; j++) {
              System.out.print("*");
          }
          for (int k = 5; k > 0; k--) {
              System.out.print("");
          }

          System.out.println("");

      }
      //for the second half
  for(int i=0;i<=4;i++){
  for(int j=4;j>i;j--){
      System.out.print("*");
  }
  for(int k=1;k<i;k++){
  
      System.out.print(" ");
  }
      System.out.println("");
  }
  }  
}
