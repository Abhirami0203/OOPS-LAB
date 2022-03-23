import java.util.*;
class calculator
{
public static void main(String []args)
   {
    int a,b,c,choice;
    Scanner s1=new Scanner(System.in);
    System.out.println("\n1.Add \n2.Subtract \n3.Product \n4.Divide");
    System.out.println("Enter the numbers:");
     a=s1.nextInt();
     b=s1.nextInt();
    System.out.println("Enter choice:");
     choice=s1.nextInt();
switch(choice)
{
case 1:
           c=a+b;
           System.out.println("the sum is" +c);
            break;
case 2:
           c=a-b;
           System.out.println("the difference is" +c);
            break;
case 3:
           c=a*b;
           System.out.println("the product is" +c);
            break;
case 4:
            c=a/b;
           System.out.println("the reminder is" +c);
            break;
   default:
             System.out.println("Wrong choice");
}
}
}
          
           