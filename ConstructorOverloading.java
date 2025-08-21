public class ConstructorOverloading{
int roll_no;
String name;
int marks;
public ConstructorOverloading(){
roll_no=1;
name="Vaishnavi";
marks=50;
System.out.println("Roll no: "+roll_no+"Name: "+name+"Marks: "+marks);
}
public ConstructorOverloading(int r){
roll_no=r;
System.out.println("Roll no: "+roll_no);
}
public ConstructorOverloading(int r,String n){
roll_no=r;
name=n;
System.out.println("Roll no: "+roll_no+"Name: "+name);
}
public ConstructorOverloading(int r,String n, int m){
roll_no=r;
name=n;
marks=m;
System.out.println("Roll no: "+roll_no+"Name: "+name+"Marks: "+marks);
}
public static void main(String args[]){
ConstructorOverloading s1= new ConstructorOverloading();
ConstructorOverloading s2= new ConstructorOverloading(144);
ConstructorOverloading s3= new ConstructorOverloading(141,"Janhavi");
ConstructorOverloading s4= new ConstructorOverloading(143,"Vrushali",50);
}
}
