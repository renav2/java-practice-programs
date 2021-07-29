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
public class fibonachi111 {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
        System.out.println("last no");    
int a=in.nextInt();
int next=1,prev=0,no;
for(int i=0;i<a;i++){
no=next+prev;
    System.out.println(no);
prev=next;
next=no;

}



    
    }
}
