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
public class factorial {
    public static void main(String args[]){
    //factorial
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int temp=1;
        
        for(int i=1;i<=a;i++){
           temp *=i;
        }
        System.out.println(temp);
       
    }
}
