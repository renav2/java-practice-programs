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
public class patternabcd {
  public static void main(String[] args)
    {
	int alphabet = 65;
	int rows = 5;
        System.out.println("## Printing the pattern ##");
        for (int i = 1; i <= rows; i++)
        {   char c;
           for(c='a';c<='z';c++ )
            System.out.print(c);
        }System.out.println("");
    }
}
