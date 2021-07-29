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
public class multiplication_table {
public static void main(String args[]){
Scanner in=new Scanner(System.in);

    int a=in.nextInt();
for(int i=1;i<=10;i++){
    System.out.println(a+"*"+i+"="+(a*i));
}

}    
}
