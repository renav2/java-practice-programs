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
public class search_in_linklist {
    private link head;
    private static class link{
    private int data;
    private link next;
    public link(int data){
    this.data=data;
    this.next=null;
    
    
    }
    }
    void inser(int pos, int data){
    link node=new link(data);
    
    if(pos==1){
    node.next=head;
    head=node;
    
    
    }else{
    link prev=head;
    int count=1;
    while(count<pos-1){
    prev=prev.next;
    count++;
    
    }
    //linking
    link temp=prev.next;
    prev.next=node;
    node.next=temp;
    
    
    
    }
        
        
    }
    
    void dlt(int pos){
    if(pos==1){
    head=head.next;
    
    }else{
    link prev=head;
    int count=1;
    while(count<pos-1){
    prev=prev.next;
    count++;
    
    }
    link temp=prev.next;
    prev.next=temp.next;
    
    
    }
    
    }
    
    void search(int key){
    link temp=head;
    while(temp!=null){
       if(temp.data==key){
           System.out.println("\n\n"+key+"\nelement is present in link list");
       
       }
    temp=temp.next;
    }
    
    
    }
    
    
    void show(){
    link temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
    temp=temp.next;
    }
    
    }
    
    
    
    public static  void main(String args[]){
    search_in_linklist obj=new search_in_linklist();
    obj.inser(1, 55);
     obj.inser(2, 49); 
     obj.inser(3, 39);
     obj.inser(4, 29);
     obj.inser(5, 19);
        System.out.println("orignal");
obj.show();
        System.out.println("after insert element in link list");
        // i need to inser at second postion for that 
         obj.inser(3, 100); 
        obj.show();
        System.out.println("delete elemnt in perticular loc");
        obj.dlt(3);
        obj.show();
        obj.search(49);
        
        
        
    }
}
