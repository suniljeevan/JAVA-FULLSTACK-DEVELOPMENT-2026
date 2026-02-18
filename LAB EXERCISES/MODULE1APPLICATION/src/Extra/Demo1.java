//java 8 new feature 
//functional interface
//this is an interface with exactly one abstract method
//in comparision to interface , an interface consists of n number 
//of abstract methods, whereas function interface consists of only
// 1 abstract method. We can apply lambda expression only in case of
// functional interface. It is helpful while using builtin and
// open source api.
//create an interface myinterface with 3 methods. Change to 3 functional
// interface
@FunctionalInterface
interface myinterface1 {
	void method1();
	
}
@FunctionalInterface
interface myinterface2 {
	void method2();
	
}
@FunctionalInterface
interface myinterface3 {
	void method3();
	
}

//limitation - partial implemention of interface is not allowed

public class TEST1 {
	public static void main(String[] args) {
		// ob1 holds myclass1 object
       myinterface1 ob1=()->{System.out.println("method1 from anonymous class 1");};
       myinterface2 ob2=()->{System.out.println("method2 from anonymous class 1");};
       myinterface3 ob3=()->{System.out.println("method3 from anonymous class 1");};
       //ob1 holds myclass2 object. This dynamic nature brings loose-coupling 
       // which has many application later will be seen
       //this is called dynamic polymorphism // segregation
       ob1.method1();
       ob2.method2();
       ob3.method3();
       
       ob1 = ()->{System.out.println("method1 from anonymous class 2");};
       ob2 = ()->{System.out.println("method2 from anonymous class 2");};
       ob3 = ()->{System.out.println("method3 from anonymous class 2");};
       ob1.method1();
       ob2.method2();
       ob3.method3();
       
	}

}









