/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;
import static java.lang.Math.sqrt;
import java.util.*;
/**
 *
 * @author rvkul
 */
public class NewClass1 {
  public static void main(String args[]){
      System.out.println("product no");
  Scanner in=new Scanner(System.in);
  int a=in.nextInt();
      System.out.println("enter the amount ");
      int cnt=0;
  int aa[]=new int [a];
  {
  for(int i=0;i<a;i++){
  aa[i]=in.nextInt();
  
  }
      System.out.println("print");
  for(int i=0;i<a;i++){
      System.out.println(aa[i]);
      
          
          
      }
      System.out.println("count ");
   for(int i=0;i<a;i++){
       int temp=aa[i];
       System.out.println(temp);
     int sr=(int) sqrt(aa[i]);
       System.out.println("sqroot"+sr);
      if (temp==(sr*sr)){
          System.out.println("count"+cnt++);
          
      }
  
          
      }
  
  }
  }

//  #include <iostream>
//#include <math.h>
//
//using namespace std;
//
//int main()
//{
//   int n,i,arr[1000000],cnt=0;
//   cin>>n;
//   for(i=0;i<n;i++){
//       cin>>arr[i];
//   }
//   
//   for(i=0;i<n;i++){
//       
//       int temp= arr[i];
//       
//         int sr = sqrt(temp); 
//
//            if (sr * sr == temp)
//                cnt++;
//    
//       
//       
//       
//   }
//   cout<<cnt;
//   

  

  
   
  
  
  
  
  
  }
  
     
