import java.util.*;
public class Areaofcircle
{
double radius,result;
public double area()
{
result=3.14*radius*radius;
return result;
}
public static void main(String args[])
{
Areaofcircle a= new Areaofcircle();
Scanner s= new Scanner(System.in);
System.out.println("Enter the radius");
a.radius=s.nextDouble();
System.out.println("Area of Circle is:"+a.area());
}
}