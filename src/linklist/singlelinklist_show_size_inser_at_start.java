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
public class singlelinklist_show_size_inser_at_start {
    private link head;

    private static class link {

        private int data;
        private link next;

        public link(int data) {
            this.data = data;
            this.next = null;

        }

    }
    void show(){
    link temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
    temp=temp.next;
    
    }
    
    }
    
            
            
     void size(){
    link temp=head;
   int  count=0;
    while(temp!=null){
        count++;
        
    temp=temp.next;
    
    }System.out.println("");
         System.out.println("size of the link list is "+count);
    }
    
    void inser(){
        System.out.println("enter the data  which u want to insert at the start of the link list");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        link new_node=new link(a);
        new_node.next=head;
        head=new_node;
    
    
    }
    
    public static void main(String args[]){
    
        singlelinklist_show_size_inser_at_start obj=new singlelinklist_show_size_inser_at_start();
        obj.head=new link(30);
        link sec=new link(90);
        link three=new link(56);
        link four=new link(78);
        
        obj.head.next=sec;
        sec.next=three;
        three.next=four;
        
        obj.show();
        obj.size();
        obj.inser();
        obj.show();
        obj.size();
    
    
    }
}
