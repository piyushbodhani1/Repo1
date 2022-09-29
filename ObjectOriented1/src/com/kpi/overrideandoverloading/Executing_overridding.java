package com.kpi.overrideandoverloading;
   
/**
 * @author PiyushBodhani
 * Run time polymorphism
 *
 */
public class Executing_overridding extends Features2 implements Features {

	@Override
	public String smart() {
		// TODO Auto-generated method stub
		return "YES";
	}

	@Override
	public int power() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int IQ() {
		// TODO Auto-generated method stub
		return 120;
	}
	int method1() {
    	return 2;
    }
	 String method2(){
	    	return "YES I M There";
	    }

	public static void main(String args[])
	{
		Executing_overridding o1 = new Executing_overridding();
		System.out.println(o1.IQ());
		System.out.println(o1.method1());
		System.out.println(o1.method2());
		System.out.println(o1.smart());
		System.out.println(o1.power());
		
	}
      
}
