import java.util.*;
class Areas
{
void calculateAreas(float x)
{
System.out.println("Area of the square: "+x*x+" sq units");
}
void calculateAreas(float x,float y)
{
System.out.println("Area of the rectangle: "+x*y+" sq units");
}
void calculateAreas(double r)
{
double area=3.14*r*r;
System.out.println("Area of the circle: "+area+" sq units");
}
public static void main(String args[])
{
int s;
float l,b;
double r;
Areas obj=new Areas();
Scanner sc=new Scanner(System.in);
System.out.println("Enter side of square");
s=sc.nextInt();
System.out.println("Enter length and breadth of a rectangle");
l=sc.nextFloat();
b=sc.nextFloat();
System.out.println("Enter radius of the circle");
r=sc.nextDouble();
obj.calculateAreas(s);
obj.calculateAreas(l,b);
obj.calculateAreas(r);
}
}