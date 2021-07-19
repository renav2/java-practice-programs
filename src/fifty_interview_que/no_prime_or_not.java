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
public class no_prime_or_not {
   

  public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int temp=0;
for(int i=2;i<=a-1;i++){
if(a%i==0){
temp=temp+1;
}

}
if(temp>0){
    System.out.println("not a prime no");
}else{

    System.out.println("your no " +a+ " is prime no");
}


  
  }
}

