// Demonstrate class-object
// Demonstrate two-class principle
// Demonstrate S from SOLID Principle
// Encapsulation, Abstraction, Data hiding
// server classes 
import java.util.Scanner;
class Student {
	// instance variables
	private int rollno;
	private String name;
	private double cgpa;
  	// public methods as codes
	// setter getter  business methods
	// alt shift s
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	// method to update cgpa
	public void updateCgpa() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new cgpa");
		double newcgpa=sc.nextDouble();
		this.cgpa=newcgpa;
		System.out.println("CGPA Updated");
	}
	
}
//client class 
public class TEST1 {
	public static void main(String[] args) {
        Student ob1= new Student();
      //  ob1.cgpa=7.5; data hiding
        ob1.setName("Sahoo");
        ob1.setRollno(1);
        ob1.setCgpa(7.5);
        System.out.println(ob1.getName());
        System.out.println(ob1.getCgpa());
        System.out.println(ob1.getRollno());
        ob1.updateCgpa();
        System.out.println(ob1.getCgpa());
	}

}





