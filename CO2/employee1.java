import java.util.*;
class employee1
{
int empid;
String empname;
employee1(int id,String name)
{
empid=id;
empname=name;
}
void display()
{
System.out.println("employee id"+empid);
System.out.println("employee name"+empname);
}
public static void main(String[] args)
{
int id1;
String name1;
employee1[] emp=new employee1[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<2;i++)
{
id1=sc.nextInt();
name1=sc.next();
emp[i]=new employee1(id1,name1);
}
System.out.println("employee details/n");
for(int i=0;i<2;i++)
{
emp[i].display();
}
}
}
