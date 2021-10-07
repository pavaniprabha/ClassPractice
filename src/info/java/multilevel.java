package info.java;

public class multilevel {
    int A = 10;
    int B = 20;
     public void testA() {
    	  System.out.println("in multilevel :" + (A+B));	 
     } 
     public static void main(String[] args) {
    	   System.out.println("in main method");
    	   level3 hello = new level3();
    	   hello.testC();
    	   level2 hello1 = new level2();
    	   hello1.testB();
    	   multilevel hello2 = new multilevel();
    	   hello2.testA();
    	 }
}
class level2 extends multilevel {
	public void testB() {
		System.out.println(A);
		System.out.println(B);
		System.out.println("in level2 ");
	}
}
class level3 extends level2 {
	public void testC() {
		System.out.println(A);
		System.out.println(B);
		System.out.println("in level3 ");
	}


} 

