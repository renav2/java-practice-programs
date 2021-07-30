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
public class abstract_class {
 //me->cooking ->dancing->earningsource->teaching   
    
    public static void main(String args[]){
     me obj=new prasad1() {

         @Override
         public void dacing() {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void teaching() {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     } ;
     obj.cookin();
     obj.dacing();
     obj.earning();
    
    }
    
    
}
 abstract class  me{
public void cookin(){
    System.out.println("cooking");

}
public abstract void  dacing();
public abstract  void earning();
public abstract void  teaching();
}
//2nd 
  abstract class shubham extends me{
 public  void dancing(){
     System.out.println("dance now");
 }
 
 
 public void earning(){
     System.out.println("earn now");        
 } 
 }
//3rd
abstract class prasad1 extends shubham{
public void teching(){
    System.out.println("teach now");
}

    

}


