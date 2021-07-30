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

//a->b;
//a->c
//b->d && c->d

class aa{
    void first(){
        System.out.println("Renav from class a");
    }
}
interface  bb {
 public void mid();
}
 interface cc {
 public void last();
}
  public class dd extends aa implements bb,cc {
  public void mid(){
      System.out.println("vivek  from class bb");
  }
  public void last(){
      System.out.println("kulkarni from class cc");
  }
  public void full(){
      System.out.println( " my name is from class dd");
  }
  
  
  public static void main(String args[]){
    dd obj =new dd();
    obj.full();
    obj.first();
    obj.mid();
    obj.last();
    
}
  
  
  
  }



    
