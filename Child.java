class Parent
{
  int salary=100000;
  String surname="Yadav";
  
  public void display()
   {
    System.out.println("Salary:"+salary+ "Surname:"+surname);
   }
}
 
 public class Child extends Parent
{
   public static void main(String args[])
   {
     Child c= new Child();
     c.display();
     //System.out.println(c.surname); //by this we can seperately print surname
   }
} // here we have written file name by child class as our main function is in child class

