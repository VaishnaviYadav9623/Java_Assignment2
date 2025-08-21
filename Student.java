import java.util.*;
public class Student {
    int rollNo;
    String name;
    int marks;
    public Student(int rollNo, String name, int marks) {
      this.rollNo = rollNo;
       this.name = name;
       this.marks = marks;
       System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
       public Student(Student s) {
        rollNo = s.rollNo;
        name = s.name;
        marks = s.marks;
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student(144, "Vaishnavi", 92);
        Student s2 = new Student(s1);
    }
}