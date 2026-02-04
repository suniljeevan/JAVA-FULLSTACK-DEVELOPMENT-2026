@FunctionalInterface
interface A_Shape {
	void area();
	default void perimeter() {
		System.out.println("Restricted for 2D Shape");
	}
}
	
public class TEST4 {
	public static void main(String[] args) {
		A_Shape r=()-> {
			int rad=5;
			System.out.println("circle "+3.14*rad*4);
		};
         r.area();
         r.perimeter();
        r=()-> {
        int l=5,b=6;
        System.out.println("rectangle "+l*b);
        };
        r.area();
        r.perimeter();
	}

}
