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
public class no_is_palindromornot {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int temp=a;
    int rev=0,rem=0;
    
    while(a!=0){
    rem=a%10;
    rev=rev*10+rem;
    a=a/10;
    
    }
    if(rev==temp){
        System.out.println("your no is palindrom ");
    }else{
        System.out.println("no is not a palindrom");
    }
    
    
    }
}
