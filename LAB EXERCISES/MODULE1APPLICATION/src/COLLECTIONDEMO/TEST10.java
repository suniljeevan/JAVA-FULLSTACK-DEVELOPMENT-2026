// Comparable and Stream with List
package COLLECTIONDEMO;

import java.util.*;
import java.util.stream.Collectors;
class Studentt implements Comparable<Studentt>{
private int sid;
private String name;
private double cgpa;
//alt shift s
public Studentt(int sid, String name, double cgpa) {
	super();
	this.sid = sid;
	this.name = name;
	this.cgpa = cgpa;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
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
@Override
public String toString() {
	return "Studentt [sid=" + sid + ", name=" + name + ", cgpa=" + cgpa + "]";
}
@Override
public int hashCode() {
	return Objects.hash(cgpa, name, sid);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Studentt other = (Studentt) obj;
	return Double.doubleToLongBits(cgpa) == Double.doubleToLongBits(other.cgpa) && Objects.equals(name, other.name)
			&& sid == other.sid;
}
public int compareTo(Studentt ob) {
	return getSid()-ob.getSid();
}
}
class StudentDTO {
	int id;
	String result;
	public StudentDTO(int id, String result) {
		super();
		this.id = id;
		this.result = result;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", result=" + result + "]";
	}
	
}
public class TEST10 {
public static void main(String[] args) {
Set<Studentt> studentset=new HashSet<Studentt>();
studentset.add(new Studentt(101,"sunil",9.9));
studentset.add(new Studentt(102,"Kumar",9.8));
studentset.add(new Studentt(101,"sunil",9.7));
System.out.println(studentset);
for(Studentt s:studentset) {
System.out.println(s);
}
//iterator is not applicable for HashSet 
Studentt search=new Studentt(104,"sunil",9.9);
System.out.println(studentset.contains(search)); 
Studentt studenttoremove = new Studentt(101,"sunil",9.9);
System.out.println(studentset.remove(studenttoremove));
System.out.println(studentset);
List<Studentt> studentlist=new ArrayList<Studentt>(studentset);
Collections.sort(studentlist, (x,y) ->{
     return Double.compare(y.getCgpa(), x.getCgpa());  
   });
/*
  Types of Functional Interfaces
---------------------------------
 if method in functional interface 
  1. receives nothing returns nothing  --> Default
  2. receives input returns nothing ----> Consumer
  3. receives nothing returns output----> Supplier
  4. receives input returns output  ----> Function
  5. receives input returns boolean-----> Predicate
 */
studentlist.stream()
.map(s->s.getName())
.collect(Collectors.toList())
.forEach(x->System.out.println(x));
studentlist.stream().filter(x->x.getSid()%2==0);
List<Studentt> sorted=studentlist.stream().sorted().collect(Collectors.toList());
System.out.println(sorted);
//studentlist.stream().sorted().forEach(x->System.out.println(x));
studentlist.stream().distinct().forEach(x->System.out.println(x));
studentlist.stream().peek(x->x.setCgpa(x.getCgpa()-0.5))
                  .collect(Collectors.toList())
                  .forEach(x->System.out.println(x));
studentlist.stream().map(x->new StudentDTO(x.getSid(),x.getCgpa()>6?"pass":"fail"))
                    .collect(Collectors.toList())
                  .forEach(x->System.out.println(x));

}
}
