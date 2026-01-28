//INTERFACE , POLYMORPHISM,MOR implementation
//multiple inheritance
interface Shape {
	int y=20;
	public abstract void show();
}
class Rectangle {
	int l,b;
	void area() {
		System.out.println("Rectangle Area "+l*b);
	}
}
class Square extends Rectangle implements Shape {
	void set() {
		l=5;
		b=6;
	}
	@Override 
	public void show() {
		l=b=5;
		System.out.println("Square Area "+l*b);
	}
}
public class TEST3 {
	public static void main(String[] args) {
		Shape r=new Square();
		r.show();
		// inheritance
	 Square s=new Square();
	 s.show();
	 s.set();
	 s.area();

	}

}
