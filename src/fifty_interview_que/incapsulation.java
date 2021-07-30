/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;

/**
 *
 * @author rvkul
 */class abas{
private  int i;
 public void setI(int j){
 i=j;
 }
 public int getI(){
 return i;
 }
         
 }
public class incapsulation {
   public static void main(String args[]){
    abas obj=new abas();
    obj.setI(20);
       System.out.println(obj.getI());
      
   
   
   }
}
