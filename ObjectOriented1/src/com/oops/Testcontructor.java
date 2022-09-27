package com.oops;

public class Testcontructor {
  
	 public int a;
	  public int b;
	public Testcontructor() {
		 
	 }
      public Testcontructor(int a, int b ) {
		 this.a = a;
		 this.b = b;
	 }
      public static void main(String args[])
      {
    	  new Testcontructor();
    	  new Testcontructor(5,6);
      }
      
}
