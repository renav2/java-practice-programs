/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaforthepractice.if_else.forloop;

import java.util.Scanner;

/**
 *
 * @author rvkul
 */
public class twotable {
    public static void main (String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no which table u want :  ");
        int a=in.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+" * "+i+" ="+a*i);
        
        }
    }
}
