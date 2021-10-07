package info.java;

public class hierarchy {
	 int A = 10;
	    int B = 20;
	     public void testA() {
	    	  System.out.println("in level :" + (A+B));	 
	     } 
	     public static void main(String[] args) {
	    	   System.out.println("in main method"); 
	    	   hierarchy hello = new hierarchy();
	    	   hello.testA();
	    	   
	    	}
	}
	 class C extends hierarchy {
		public void testB() {
			System.out.println(A);
			System.out.println(B);
			System.out.println("in level2 ");
		}
			public void testC() {
				System.out.println(A);
				System.out.println(B);
				System.out.println("in level3 ");
		}
	}
	