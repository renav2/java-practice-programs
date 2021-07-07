/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop;
import java.util.Scanner;
/**
 *
 * @author rvkul
 */
public class factorial {
    public static void main (String args[]){
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=1;
    for(int i=1;i<=a;i++){
    b=b*i;
    
    }
        System.out.println(b);
    
    }
}
