@FunctionalInterface
interface B_Shape {
void volume(int r,int h);

}
public class TEST5 {
	public static void main(String[] args) {
		B_Shape ref=(r,h)-> {
			System.out.println("Sphere "+Math.PI*r*r*h);
		};
      ref.volume(5, 6);
      ref=(r,h)-> {
			System.out.println("Cylinder "+Math.PI*r*r*r);
		};
    ref.volume(5, 6);
	}

}
