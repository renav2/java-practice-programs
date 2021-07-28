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
public class rev_string_rev_int {
    public static void inti() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter ur no");
        int rev = 0, rem = 0;
        int a = in.nextInt();
        System.out.println("your no is" + a);
        while (a != 0) {
            rem = a % 10;
            rev = 10 * rev + rem;
            a = a / 10;

        }
        System.out.println("your reverse no is :-  " + rev);

    }
    
    public static void  strirev(){
         Scanner in = new Scanner(System.in);
    String ab=in.next();
    String rev=" ";
    for(int i=ab.length()-1;i>=0;i--){
    rev=rev+ab.charAt(i);
    
    }
        System.out.println(" yor revers string is"+rev);
    
    
    }
    public static void main(String args[]){
         Scanner in = new Scanner(System.in);
    rev_string_rev_int obj=new rev_string_rev_int();
        System.out.println(" press 1 if u want to reverse intiger value");
        
         System.out.println(" press 2 if u want to reverse String  value");
    int key=in.nextInt();
    
    switch(key){
        case 1:
            obj.inti();
            break;
            
        case 2:
            obj.strirev();
            break;
    
    }
    
    
    }
    
}
