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
public class brushup_plus_dlt {
    private link head;
    private  static class link{
    private int data;
    private link next;
    
    public link(int data){
    this.data=data;
    this.next=null;
    
    }
    
    }//classs
    void inser(int pos,int data){
    link node=new link(data);
    if(pos==1){
    node.next=head;
    head=node;
    
    }else{
    link prev=head;
    
        int count =1;
    while(count<pos-1){
   prev=prev.next;
   
        
        count++;
   
    }//
    link temp=prev.next;
    prev.next=node;
    node.next=temp;
            
    }
    
    }//mclos
    
    void show(){
    link temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
        
    }
    
    
    }
    void dlt(int pos){
        if(pos==1){
        head=head.next;
        
        }else{
            link prev = head;

            int count = 1;
            while (count < pos - 1) {
                prev = prev.next;

                count++;

            }//
        link temp=prev.next;
        prev.next=temp.next;
        }
    
    
    }
    
    public static void main(String args[]){
    brushup_plus_dlt obj=new brushup_plus_dlt();
    obj.inser(1,99);
    obj.inser(2,19);
    obj.inser(3,29);
    obj.inser(4,49);
    obj.inser(5,69);
        System.out.println("befor inserting");
        obj.show();
        System.out.println("after inserting");
          obj.inser(2,1);
        obj.show();
        System.out.println("delete node at perticular ");
        obj.dlt(2);
        obj.show();
    }
}
