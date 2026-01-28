class A {
int x=10;
public void m1() {
  System.out.println("base class x is :"+x);
}
}
interface B {
int x=20;
public void m1(); 
}


class C extends A implements B {
int y=30;
public void m1() {
super.m1();
System.out.println("interface x "+B.x);
}
public void m2() {
System.out.println("derived y "+y);
}
}
public class Test {
public static void main(String[] args) {
       B r=new C();
       r.m1();
       C s=new C();
       s.m1();
       s.m2();
}
}





