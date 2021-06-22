/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaforthepractice.if_else;

import java.util.Scanner;

/**
 *
 * @author rvkul
 */
public class maxno {
    public static void main(String[] args){
    
    Scanner in=new Scanner(System.in);
        System.out.println("enter your first no");
    int a=in.nextInt();
        System.out.println("enter your second no");
    int b=in.nextInt();
    
    if(a>b){
        System.err.println(a+"is greter than"+b);
    }else{
        System.out.println(b+"is greter than"+a);
    }
    
    
    
    }
}
