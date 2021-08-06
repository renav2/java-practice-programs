/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.*;
/**
 *
 * @author rvkul
 */class opd{
 void insert( int array[]){
     Scanner in = new Scanner(System.in);
     System.out.println("in which index y want to  enter  the element in array");
     int inser_index=in.nextInt();
     System.out.println("enter the element in array");
             int new_elemnt=in.nextInt();
             
     array[inser_index]=new_elemnt;
     System.out.println("*****final result*****");
     for(int i=0;i<array.length;i++){
         System.out.println(array[i]);
     }
     
 }
 }
public class add_elemnt_in_perticular_position_in_array {
    public static void main(String args[]){
        System.out.println("enter the size of the array");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        System.out.println("enter the elements in array");
        int array[] = new int[size];
        {
            for (int i = 0; i < size; i++) {
                array[i] = in.nextInt();

            }
            System.out.println("elemnts in array");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i]);

            }

        }
        opd obj=new opd();
        obj.insert(array);
           
    }
}
