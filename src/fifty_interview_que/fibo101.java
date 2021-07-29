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
public class fibo101 {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int back=0 ,no,next=1;
    for(int i=0;i<a;i++){
    no=next+back;
        System.out.println(no);
    back=next;
    next=no;
    }
    
    
    }
}
