package info.java;

public class Overload {

	public Overload() {
		System.out.println("in default constructor :");
	}
	public Overload(int a) {
		System.out.println("in default constructor :" + a);
	}
	public Overload(double a) {
		System.out.println("in default constructor :" + a);
	}
	public Overload(int a ,int b) {
		System.out.println("in default constructor :" + (a+b));
	}
	public Overload(float b) {
		System.out.println("in default constructor :" + b);
	}
	
	
	public static void main(String[] args) {
	System.out.println("in main method :");
	Overload hello = new Overload(10,20);
	hello.doSomething();
	hello.doSomething(20.30f);
	hello.doSomething(30);
	doSomething(29, 45);
	}
	public void doSomething() {
		System.out.println("in method :");
	}
    void doSomething(int a) {
    	System.out.println("hello method :" + a);
    	
    }
      static  int doSomething(int a, int b) {
    	  System.out.println("hello method :" + (a+b));
    	  return 0;
      }
       float doSomething(float b) {
    	   System.out.println("hello method :");
    	   return 0.0f;
       }
 
} 

