package com.kpi.overrideandoverloading;


/**
 * @author PiyushBodhani
 *
 */
public class Imagination extends Addabs implements Add{
    


	@Override
	void name() {
		System.out.println("Welcome to the abstract class");
		
	}

	public static void main(String args[])
	{
		Imagination ig = new Imagination();
		System.out.println(ig.add(45, 91));
		ig.name();
		
	}

}
