import java.util.*;
public class employee
{  
 
    public int sid;   
    String sname;    
    long sno;   
    String sdes;
    String sdep;
  
    public employee(int record_id,String name,long phone_no,String designation,String department)  
    {  
         sid=record_id; 
        sname = name; 
        sno = phone_no;
      sdes = designation;  
      sdep = department;  
    }  
    public void printemploy()  
    {  
        System.out.println("Employee id: " + sid );  
        System.out.println("Employee name: " + sname);   
        System.out.println("Employee no: " + sno);  
        System.out.println("Employee Designation: " + sdes);  
        System.out.println("Employee Department: " + sdep);     
    }  
  

    public static void main(String args[])  
    {  
        employee s = new employee(1,"manu",9876566780L,"manager","sales");  
 
        s.printemploy();  
    }  
}  
