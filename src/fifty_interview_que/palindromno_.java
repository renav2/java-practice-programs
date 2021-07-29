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
public class palindromno_ {
    public static void main(String args[]){ 
    Scanner in=new Scanner (System.in);
        System.out.println("entr the no");
        
            
    int a=in.nextInt();
    
    int actual=a;
    int rev=0,rem=0 ;
while(a!=0){
    rem=a%10;
    rev=10*rev+rem;
    a=a/10;

}    //System.out.println(//a);
        System.out.println("your rev no is "+rev);
    if(rev==actual){
        System.out.println("your noumber is palindrom");  
    }else{
        System.out.println("your no is not a palindrom");
    }
    //]
    }
}
