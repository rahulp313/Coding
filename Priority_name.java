/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priority_name;

import java.util.Comparator;
import java.util.*;
import java.util.PriorityQueue;
import java.util.Scanner;
class Employee
{   int id;
    int salary;
    String name;
    void show()
    {  System.out.println(id+"  "+salary+"  "+name);   }
}

 class MyComparator implements Comparator <Employee>
        { int i;
            public int compare(Employee e6,Employee e7)
            {
               if(e6.name.compareTo(e7.name)==0) {
               	return 0;
               }else if(e6.name.compareTo(e7.name)>0) {
               		return 1;
               }else {
               		return 0;
               }
        }  }
       

public class Priority_name {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
          System.out.println("enter the values in id,salary,name sequence");
         Employee e1=new Employee();
       e1.id=sc.nextInt();
        e1.salary=sc.nextInt();
         e1.name=sc.next();
         
        System.out.println("enter the values in id,salary,name sequence");
        Employee e2=new Employee();
        e2.id=sc.nextInt();
         e2.salary=sc.nextInt();
          e2.name=sc.next();
        
        System.out.println("enter the values in id,salary,name sequence"); 
        Employee e3=new Employee();
        e3.id=sc.nextInt();
        e3.salary=sc.nextInt();
         e3.name=sc.next();
        
                
        MyComparator cmp=new MyComparator();
        PriorityQueue<Employee> pq=new PriorityQueue<>(3,cmp);
        pq.add(e1);
        pq.add(e2);
        pq.add(e3);
        Iterator itr=pq.iterator();
       
        System.out.println("dictionary order of output");
        while(itr.hasNext())  
        {
            Employee obj=(Employee)itr.next();//Object obj
            obj.show();
        }  }   }
