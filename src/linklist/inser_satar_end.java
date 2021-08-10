/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;
import java.util.*;

/**
 *
 * @author rvkul
 */
public class inser_satar_end {
    private link head;

    private static class link {

        private int data;
        private link next;

        public link(int data) {
            this.data = data;
            this.next = null;

        }
    }
    //display
    void show(){
    link temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
        
    }
    
    }
    void star(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the new data ");        
int new_data=in.nextInt();

    link new_node=new link(new_data);
  new_node.next=head;
  head=new_node;
  
    
    }
    void last(){
    Scanner in=new Scanner(System.in);
        System.out.println("last enter the new data ");        
int new_data=in.nextInt();
link new_node=new link(new_data);
if(head==null){
head=new_node;
    System.out.println("");

}link curr=head;
while(null!=curr.next){
curr=curr.next;}
    curr.next=new_node;
    }
    
    
    
   public static void main(String args[]){
   inser_satar_end obj=new inser_satar_end();
   obj.head=new link(39);
   link sec=new link(57);
   link thir =new link(90);
   
   //
   obj.head.next=sec;
   sec.next=thir;
   obj.show();
   obj.star();
   obj.show();
   obj.last();
   obj.show();
   } 
}
