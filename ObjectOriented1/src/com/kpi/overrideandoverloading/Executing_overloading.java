package com.kpi.overrideandoverloading;

/**
 * @author PiyushBodhani
 *   Complile Time polymorphism
 */
public class Executing_overloading {
   public int method1(int a)
   {
	   return a;
   }
   public int method1(int a , int b)
   {
	   return a*b;
   }
   public void method1()
   {
	   System.out.print("No argument method");
   }
   public static void main(String args[])
   {
	   Executing_overloading o1 = new Executing_overloading();
	   System.out.println(o1.method1(2));
	   System.out.println(o1.method1(5, 6));
	   o1.method1();
	   
   }
   
}
