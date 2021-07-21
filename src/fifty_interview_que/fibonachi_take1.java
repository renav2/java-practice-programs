/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;

import java.util.Scanner;

/**
 *
 * @author rvkul
 */
public class fibonachi_take1 {
    public static void main(String args[]){
    Scanner in =new Scanner(System.in);
        System.out.println("last no of the series");
    int a=in.nextInt();
    int b=0, c=1,no;
    for(int i=0;i<=a;i++){
    no=b+c;
        System.out.println(no);
    b=c;
    c=no;
    
    }
    
    
    }
}
