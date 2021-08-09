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
public class singlelinklist {
    private  linknode head;

    
    
    private static class linknode{
    private int data ;
    private linknode next;
    
    
    public linknode(int data){
    this.data=data;
    this.next=null;
    }}
   public  void display(){
    linknode temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
        System.out.println("");
    
    
    
    }
    
    
    
    public static void main(String args[]){
     singlelinklist obj= new singlelinklist();
     obj.head=new linknode(10);
     linknode fir= new linknode(20);
     linknode sec=new linknode(25);
     
     //connecting node with
     obj.head.next=fir;
     fir.next=sec;
     
    obj.display();
    
    
    }
    }
    
    

