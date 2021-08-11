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
public class link_all_in_one {
    private link head;
    private static class link {

        private int data;
        private link next;

        public link(int data) {
            this.data = data;
            this.next = null;

        }

    }
    
    void insert(int pos, int data) {
        link node = new link(data);
        if (pos == 1) {
            node.next = head;
            head = node;
        } else {
            link prev = head;

            int count = 1;
            while (count < pos - 1) {
                prev = prev.next;
                count++;

            }
            link temp = prev.next;
            prev.next = node;
            node.next = temp;

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
    }
            link temp=prev.next;
            prev.next=temp.next;
            
    
    }
    }
    void search(int key){
     link temp=head;
    if(temp==null){
        System.out.println("link list is empty");
    }else{
    while(temp!=null){
        if(temp.data==key){
            System.out.println("element is prest in link list ");
        }
        temp=temp.next;
    }
    
    }
    
    }
    
    
    
    
    void display(){
    link temp=head;
    if(temp==null){
        System.out.println("link list is empty");
    }else{
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    
    }
    }

    
    
    
    public static void main(String args[]){
    link_all_in_one obj=new link_all_in_one();
    Scanner in=new Scanner(System.in);
        System.out.println("yor link list is");
    obj.insert(1,49);
    obj.insert(2,39);
    obj.insert(3,29);
    obj.insert(4,19);
    
    obj.display();
        System.out.println("\nenter the number of  which operation you want to perform");
        System.out.println("1)inser");
        System.out.println("2)delet");
        System.out.println("3)search");
        System.out.println("enter your  choice");
        int ch=in.nextInt();

    switch(ch){
    
        case 1:
            System.out.println("***inser***");
            System.out.println("enter position");
            int position= in.nextInt();
            System.out.println("enter data ");
            int data1=in.nextInt();
            obj.insert(position, data1);
            obj.display();
            break;
        case 2:   
    System.out.println("***dlt***");
            System.out.println("enter position");
             position= in.nextInt();
    obj.dlt(position);
            obj.display();
            break;
    case 3:   
    System.out.println("***search***");
            System.out.println("enter elemnt which u want to search");
            int  elemnt = in.nextInt();
    obj.search(elemnt);
           
            break;
    
    
    }
   
        
    }
}
