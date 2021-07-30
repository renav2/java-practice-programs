/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;

/**
 *
 * @author rvkul
 */
public class method_over {
    public void add(int a,int b){
    int c=a+b;
        System.out.println("addition  " +c);
    
    
    }
    
    public void add(int a,int b,int c){
    
    int d=a+b+c;
        System.out.println("add of 3 no "+d);
    }
    
}
 class araa{
public static void main(String args[]){
method_over obj= new method_over();

obj.add(5, 5,6);
}
}
