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
public class noisodd_ornot {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    if(a%2==0)
    {
        System.out.println("your no is even");
    }else{
        System.out.println("yor no is odd");
    }
    
    }
}
