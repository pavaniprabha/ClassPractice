package com.blz;

public class ExceptionDemo {
   public static void main(String[] args) {
    try {
    	System.out.println("1");
    	int a = 10;
    	System.out.println(a/2);
    	int[] arr = {10,30,50,70,90};
    	arr[7] = 68;
    	System.out.println("11");
    	String str = "hello";
    	System.out.println("12");
    	
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    	System.out.println(e.hashCode());
    	System.out.println(e);
    	System.out.println(e.fillInStackTrace());
    	System.out.println(e.getLocalizedMessage());
    	System.out.println(e.toString());
    }finally {
    	System.out.println("done");
    }
    
   
   }

}
