//create POJO - plain old java object
// A class consists of getter, setter
// constructors, hashCode(), equals(), toString()
// may implements Serializable 

import java.util.Objects;

class Employee {
	private int eid;
	private String name;
	private double salary;
	// alt shift s
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int eid, String name, double salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
	}
	@Override
	public int hashCode() {
		return Objects.hash(eid, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

}
public class TEST1 {
	public static void main(String[] args) {
		// pojo, bean, ejb, model, entity
        Employee first=new Employee();
        Employee second=new Employee();
        Employee third=new Employee();
        first.setEid(101);
        first.setName("Aakash");
        first.setSalary(100000);
        System.out.println(first);
        second.setEid(101);
        second.setName("Aakash");
        second.setSalary(100000);
        System.out.println(second);
        System.out.println(first.equals(second));
        third.setEid(103);
        third.setName("Aakash");
        third.setSalary(100000);
        System.out.println(third);
        System.out.println(first.equals(third));
	}

}
