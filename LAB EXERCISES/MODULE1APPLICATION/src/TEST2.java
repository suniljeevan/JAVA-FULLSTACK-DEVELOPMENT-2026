// create POJI - plain old java interface
// apply dmd for dynamic polymorphism
interface Shape {
	// public abstract is not compuslory
	public abstract void area();
	// by default , public abstract
	void perimeter();
}
class Circle1 implements Shape {
	private int r; 
	//alt shift s
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	@Override   // not mandatory
	public void area() {
		System.out.println("circle1 Area "+Math.PI*r*r);
	}
	
	@Override
	public void perimeter() {
		System.out.println("circle1 perimeter "+2*Math.PI*r);
	}
}
class Circle2 implements Shape {
	private int r;
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	@Override   // not mandatory
	public void area() {
		System.out.println("circle2 Area "+Math.PI*r*r);
	}
	@Override
	public void perimeter() {
		System.out.println("circle2 perimeter "+2*Math.PI*r);
	}
}
public class TEST2 {
	public static void main(String[] args) {
           Circle1 ob1=new Circle1(); 
           Circle2 ob2=new Circle2(); 
           ob1.setR(4);
           ob2.setR(5);
           Shape r=ob1;
           r.area();
           r.perimeter();
           r=ob2;
           r.area();
           r.perimeter();
           
	}

}







