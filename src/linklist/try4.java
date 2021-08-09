/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

/**
 *
 * @author rvkul
 */
public class try4 {
    private link head;
    private static class link{
    private int data;
    private link next;
    
    
    public link(int data){
    this.data=data;
    this.next=null;
    
    
    }
    
    
    }//link 
    void display(){
    link temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
        temp=temp.next;
        }
    
    }
    
    public static void main(String args[]){
    try4 obj=new try4();
    obj.head=new link(30);
    link sec=new link(40);
    link thir=new link(50);
    
    obj.head.next=sec;
    sec.next=thir;
    obj.display();
    
           
    
    }
}
