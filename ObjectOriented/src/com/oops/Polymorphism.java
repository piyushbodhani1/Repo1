package com.oops;


class Helper {
	 //static keyword permits methods at class level: it is sharable across different classes
   // Method with 2 integer parameters
	//2*4
	//2.3*3.2=6
   static int Multiply(int a, int b)
   {

       // Returns product of integer numbers
       return a * b;
   }
   
   
   // Method 2
   // With same name but with 2 double parameters
   //23.45
   //double:data type that allows double precision floating point
   //different return types
   static double Multiply(double a, double b)
   {

       // Returns product of double numbers
       return a * b;
   }
   //Method 3
   //float
   static float Multiply(float a , float b)
   {
	   return a*b;
   }
}


public class Polymorphism {
	public static void main(String a[])
	{
	 System.out.println(Helper.Multiply(2, 4));
     System.out.println(Helper.Multiply(5.5, 6.3));
     System.out.println(Helper.Multiply(5.1, 7.6));
	}

}
