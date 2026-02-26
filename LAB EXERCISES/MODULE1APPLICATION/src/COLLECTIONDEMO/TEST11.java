//Demonstration of Map
package COLLECTIONDEMO;

import java.util.*;
import java.util.stream.Collectors;
//pojo custom class
class Subject implements Comparable<Subject> {
	private int subjectCode;
	private String subjectName;
	private double credit;
	public int compareTo(Subject second) {
	return Integer.compare(this.subjectCode,second.subjectCode);
	}
	public int getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public Subject(int subjectCode, String subjectName, double credit) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.credit = credit;
	}
	public Subject() {
		super();
	}
	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", credit=" + credit + "]";
	}
	
}
//service class
public class TEST11 {
	public static void main(String[] args) {
       //creating custom map
	Map<String, List<Subject>> coursetable= 
			new TreeMap<String,List<Subject>>();
	//adding entries
	List<Subject> list4=new ArrayList<Subject>();
	list4.add(new Subject(3146,"Advanced Java",3));
	list4.add(new Subject(3001,"OOP using C++",3));
	list4.add(new Subject(1004,"Operating System",4));
	list4.add(new Subject(1005,"Computer Network",3));
	list4.add(new Subject(1006,"COA",3));
	list4.add(new Subject(1007,"DAA",3));
	list4.add(new Subject(1008,"PPS",0));
	list4.add(new Subject(1009,"MPMC",4));
	list4.add(new Subject(1010,"C #",3));
	List<Subject> list6=new ArrayList<Subject>();
	list6.add(new Subject(3151,"Java FullStack",3));
	list6.add(new Subject(3152,"Frontend Fullstack",3));
	list6.add(new Subject(2015,"DAV",4));
	list6.add(new Subject(2016,"Compiler Design",3));
	list6.add(new Subject(2013,"Cloud Computing",3));
	list6.add(new Subject(1009,"Python Training",0));
	list6.add(new Subject(1008,"PPS",0));
	list6.add(new Subject(1009,"NLP",4));
	List<Subject> list2=new ArrayList<Subject>();
	list2.add(new Subject(1000,"DataStructure",3));
	list2.add(new Subject(301,"DBMS",3));
	list2.add(new Subject(1001,"TOC",4));
	list2.add(new Subject(1005,"English",3));
	list2.add(new Subject(1006,"ECE",3));
	list2.add(new Subject(1007,"OE1",3));
	list2.add(new Subject(1008,"DD",0));
	list2.add(new Subject(1009,"PPS",4));
	
	coursetable.put("20211CSE568", list6);
	coursetable.put("20211CSE564", list6);
	coursetable.put("20211CSE564", list6);
	coursetable.put("20211CSE564", list6);
	coursetable.put("20231CSE077", list2);
	coursetable.put("20231CSE078", list2);
	coursetable.put("20231CSE079", list2);
	coursetable.put("20231CSE067", list2);
	coursetable.put("20221CSE999", list4);
	coursetable.put("20221CSE888", list4);
	coursetable.put("20221CSE777", list4);
	coursetable.put("20221CSE666", list4);
	    //displaying all entries
	System.out.println("Displaying course table");
	for(Map.Entry<String,List<Subject>> e:coursetable.entrySet()) {
		System.out.println(e.getKey()+"->"+e.getValue());
	}
	//find all courses with 3 credit
	for(Map.Entry<String,List<Subject>> e: coursetable.entrySet()) {
		List<Subject> subjects=e.getValue();
		for(Subject subject:subjects) {
			if(subject.getCredit()==3)
				System.out.println(subject);
		}
		//to find total credit for 20211CSE568
		//step1 find listof subject
		List<Subject> subjs=coursetable.get("20211CSE568");
		double total=subjs.stream()
				.mapToDouble(x->x.getCredit())
				.reduce(0, (s,y)->s+y);
System.out.println("Total credit for 20211CSE568 is "+ total);
			
	}
}
}







