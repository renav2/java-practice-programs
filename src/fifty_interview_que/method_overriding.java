/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;

class ren1{
public  void show(){
    System.out.println("my name is renav");
}
}
class ren2 extends ren1{
public void show(){
    System.out.println("only renav");
}
}



public class method_overriding {
    public static void main(String args[]){
    ren1 obj=new ren2();
    obj.show();
          
    
    
    }
}
