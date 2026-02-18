//create a functional interface shape , add a method area()
//use lambda expression to print area of circle and rectangle
@FunctionalInterface
interface shape {
	void area(int s);
}
public class TEST2 {
	public static void main(String[] args) {
     shape ob=(s)->{
    	double area;
    	area=3.141*s*s;
    	System.out.println("area of circle is "+area);
    	 
     };
     ob.area(5);
     ob=(s)-> {
    	 double area=s*s;
    	 System.out.println("area of rectangle is "+area);
     };
     ob.area(7);
	}

}
