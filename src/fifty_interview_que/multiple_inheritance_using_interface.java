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
interface my_mom {

    public void m_name();
}

interface my_dad {

    public void f_name();

}
 class my_self implements my_mom,my_dad{
public void m_name(){
    System.out.println("mother name is bharti");
}
public void f_name(){
    System.out.println("father name is vivek");
}
void myname(){
    System.out.println("my name is renav");
}

}

public class multiple_inheritance_using_interface {
    public static void main(String args[]){
    my_self obj=new my_self();
    obj.myname();
    obj.f_name();
    obj.m_name();
    
    }
}
