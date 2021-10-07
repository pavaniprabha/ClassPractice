package com.blz;

import java.util.Scanner;

public class ExceptionDemo1 {
  public static void main(String[] args) throws Throwable {
//   try {
//	   System.out.println("hello");
//	   int a = 10/0;
//	   System.out.println(a);
//   }catch(ArithmeticException e) {
//	   System.out.println(e.getMessage());
//	   throw new ArithmeticException("error");
//   }finally {
//	   System.out.println("done");
//   }
//    
// }
//  public void demo() throws Throwable  {
	 try {
      
        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[] arr = new int[limit];
      

        for (int i = 0; i< arr.length; i++) {
        	System.out.println("enter " + i + "indexvalue :\n" );
        	arr[i] = sc.nextInt();
        	  arr[5] = 27;
	 }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " " );
	 }
  }catch(ArrayIndexOutOfBoundsException e) {
	  throw new Exception("ERROR");
  }finally {
	  System.out.println("done");
  }
    
 }

}

