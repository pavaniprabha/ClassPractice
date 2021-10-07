package info.java;

public class Program {

	
    int myVar = 0;
	Program(int a) {
		System.out.println("hi constructor :" + a);
	       myVar = 30;
	}

   public static void main(String[] args) {
	   System.out.println("hello java");
	   Program hello = new Program(89);
	   hello.Method();
        
  }
     public void Method() {
     System.out.println(" in method :" + myVar);
     
     }
     
   
 }