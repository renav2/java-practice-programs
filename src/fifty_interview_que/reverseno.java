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
public class reverseno {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
        System.out.println("enter the no");
    int a=in.nextInt();
    int rev=0,rem=0;
    while(a!=0){
    rem=a%10;
    rev=rev*10+rem;
    a=a/10;
    
    }
        System.out.println(rev);
    
    }
}
