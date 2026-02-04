
import java.util.*;
class Student {
	private int id;
	private String name;
	private double cgpa;
	// alt shift s
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Student(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	public Student() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(cgpa, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(cgpa) == Double.doubleToLongBits(other.cgpa) && id == other.id
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	
	
}

public class TEST6 {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(2,"ankith",7.7));
		list.add(new Student(1,"bijay",5.5));
		list.add(new Student(3,"mayank",6.5));
		list.add(new Student(11,"aman",8.5));
		list.add(new Student(6,"anubhav",8.3));
		System.out.println(list);
		System.out.println("After sorting by id");
		Collections.sort(list,(m,n)-> {
			return n.getId()-m.getId();
		}
		);
		System.out.println(list);	
		System.out.println("After sorting by name");
		Collections.sort(list,(m,n)-> {
			return n.getName().compareTo(m.getName());
		}
		);

		System.out.println(list);
		Collections.sort(list,(m,n)-> {
			return Double.compare(n.getCgpa(), m.getCgpa());
		}
		);
		System.out.println("After sorting by cgpa");
		System.out.println(list);
	}
}


