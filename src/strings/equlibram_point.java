/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author rvkul
 */
public class equlibram_point {
    public static void main(String args[]){
    int a[]={1,2,6,4,0,-1};
    int sum=0;
        int size=a.length;
       for(int i=0;i<2;i++){
       sum+=a[i];
       }
        System.out.println("first sum  "+sum);
       
        int sum2=0;
        for(int j=3;j<size;j++){
        sum2+=a[j];
        
        }
        System.out.println("second sum is "+sum2);
        
        if(sum==sum2){
            System.out.println("the perticular index is equlibiram point");
        }
        
    }
}
