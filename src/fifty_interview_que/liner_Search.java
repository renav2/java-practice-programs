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
public class liner_Search {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int s=in.nextInt();
int a[]=new int [s];{
for(int i=0;i<s;i++){
    a[i]=in.nextInt();
}
        System.out.println("print array");
for(int i=0;i<s;i++){
        System.out.println(a[i]);
}
        System.out.println("enter the no which u want to search in the array");
int b=in.nextInt();
for(int j=0;j<a.length;j++){
if(a[j]==b){
    System.out.println("number is present in array");
    break; 
}
else {
    System.out.println("number is not present in array");
}
}




};
    
    
    }
}
