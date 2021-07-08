/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloop;
import java.util.*;
/**
 *
 * @author rvkul
 */
public class reversestring {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
String a=in.next();
    int b=a.length();
    String rev="";
    for(int i=a.length()-1;i>=0;i--){
    rev=rev+a.charAt(i);
    
    }
        System.out.println(rev);
    }}
