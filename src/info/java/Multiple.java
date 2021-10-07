package info.java;

public class Multiple {
	     public void testA() {
	    	  System.out.println("in level");	 
	     } 
	     public static void main(String[] args) {
	    	   System.out.println("in main method"); 
	    	   C base = new C();
	    	   base.testA();
	    	  
	    	}
	}
	 class B extends Multiple {
		public void testA() {
			System.out.println("in level2 ");
		}
	class C implements IA, IB{
           public void testA() {
				System.out.println("in level3 ");
		}
    }
}
	 interface IA {
		 public void testA();
			 
		 }
		 interface IB {
			 public void testA();
		 }
	 
		 
	 