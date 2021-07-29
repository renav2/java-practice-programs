/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;
import java.util.*;
/**
 *
 * @author rvkul
 */
public class SWAP_ {
    public static void main(String args[]){
    Scanner in= new Scanner(System.in);
        System.out.println("1 st no");
    int a=in.nextInt();
        System.out.println("enter 2nd no ");
        int b=in.nextInt();
        System.out.println("befor swapping");
        System.out.println("your a="+a+"and b="+b);
        //ithout using 3rd 
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after");
        System.out.println("a="+a+"b="+b);
    }
}
