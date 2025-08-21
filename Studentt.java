import java.util.*;
public class Studentt {
    int rollNo;
    String name;
    int marks;
    public Studentt(int rollNo, String name, int marks) {
      this.rollNo = rollNo;
       this.name = name;
       this.marks = marks;
       System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
       public Studentt(Studentt s) {
        rollNo = s.rollNo;
        name = s.name;
        marks = s.marks;
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Studentt s1 = new Studentt(144, "Vaishnavi", 92);
        Studentt s2 = new Studentt(s1);
        Studentt s3 = new Studentt(s1);
    }
}