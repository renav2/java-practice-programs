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
public class d1 {
    private linklist head;
    private static class linklist{
    private int data;
    private linklist next;
    
    public linklist(int data){
    this.data=data;
    this.next=null;
    
    }
   }
    public void display(){
    linklist temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
        
    }
        System.out.println("");
    }
    
    
    
    
    
    
    public static void main(String args[]){
    d1 obj=new d1();
    obj.head=new linklist(30);
    linklist sec=new linklist(20);
    linklist thir=new linklist(54);
    obj.head.next=sec;
    sec.next=thir;
    obj.display();
    
    
    }
}
