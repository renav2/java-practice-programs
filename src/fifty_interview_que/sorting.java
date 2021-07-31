/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifty_interview_que;

/**
 *
 * @author rvkul
 */
class a1a {

    void sorting(int arr[]) {
//sort    
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        System.out.println("sorted array");

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

//print array
    }

}

public class sorting {

    public static void main(String args[]) {
        a1a obj = new a1a();
        int arr[] = {1, 33, 23, 11, 4, 5, 7};
        System.out.println("orignal array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        obj.sorting(arr);
    }
}
