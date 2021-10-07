package info.java;

public class SingleInheritance {
	 int A = 30;
	 int B = 56;
	 protected int C = 78;
	 public void testA() {
		 System.out.println("in super class");
	 }

}
class BaseClass extends SingleInheritance{
	 public void testB() {
		 System.out.println(A);
		 System.out.println(C);
		 System.out.println(B);
	 } 
 public void testA() {
	 System.out.println ("in child class");
 }
 public static void main(String[] args) {
	    System.out.println("in main method");
	    SingleInheritance hello = new SingleInheritance();
	    hello.testA();
	    BaseClass demo = new BaseClass();
	    demo.testB();
	    demo.testA();
}
}