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
public class leap_year {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
        System.out.println("enter year");
    int a=in.nextInt();
            if(a%4==0)
            {
                        if(a%100==0)
                    {
                                    if(a%400==0){

                                    System.out.println(" leap year");
                                }   else{
                                    System.out.println("not  a leap year");
                                }
                    }else{
                        System.out.println("a leap year");
                    }

            }else {

                System.out.println("not a leap year");
            }
    
    }
    
}
