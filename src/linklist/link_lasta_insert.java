/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

import java.awt.BorderLayout;
import java.util.*;

/**
 *
 * @author rvkul
 */
public class link_lasta_insert {
    private link head;
    private static class link{
    private int data;
    private link next;
    public link(int data){
    this.data=data;
    this.next=null;
    
    
    }
    }
    
    void insert(int position, int data){
    link node=new link(data);
    if(position==1){
    node.next=head;
    head=node;
    } else {
        link prev = head;
        int count = 1;
        while (count < position - 1) {
            prev = prev.next;
            count++;

        }
link temp=prev.next;
prev.next=node;
node.next=temp;

   
    }
     
    
    
    
    }
    void show(){
    link temp=head;
    if(temp==null){
        System.out.println("link list is empty");
    }else{
    while (temp!=null){
        
        
        System.out.print(temp.data+"->");
        temp=temp.next;
        
            
    }System.out.println("");
    
    }
    }
    
    public static void main(String args[]){
    link_lasta_insert obj= new link_lasta_insert();
    obj.insert(1,99);
     obj.show();
    
    }
}
