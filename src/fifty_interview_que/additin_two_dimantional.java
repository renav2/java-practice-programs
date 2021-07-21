/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;
import java.util.*;

/**
 *
 * @author rvkul
 */
public class additin_two_dimantional {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
        System.out.println("enter the value of row");
int row=in.nextInt();
        System.out.println("enter the value of col");
int col=in.nextInt();
        System.out.println("your array matrix having "+row+"rows and "+col+"column");
//first array
System.out.print("enter the first array ");
int a[][]=new int[row+1][col+1];{
for(int i=0;i<row+1;i++){
for(int j=0;j<col+1;j++){
   a[i][j]=in.nextInt();
}System.out.println("");
}  
    }
  //end first array  
System.out.print("enter the second array ");
int b[][]=new int[row+1][col+1];{
for(int i=0;i<row+1;i++){
for(int j=0;j<col+1;j++){
   b[i][j]=in.nextInt();
}
    System.out.println("");
        
}  
    }

        System.out.println("addition result ");
int result[][]=new int[row+1][col+1];{
for(int i=0;i<row+1;i++){
for(int j=0;j<col+1;j++){
   result[i][j]=a[i][j]+b[i][j];
}
    System.out.println("");
}  
//printing result
for(int i=0;i<row+1;i++){
for(int j=0;j<col+1;j++){
    System.out.print(result[i][j]);
}
    System.out.println("");
}  



    }


    }  
}
