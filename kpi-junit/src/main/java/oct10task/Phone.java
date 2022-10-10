package oct10task;

import java.util.function.BiFunction;

/**
 * @author PiyushBodhani JDK -> java development tool kit is the kit where we
 *         have development tools and we use them in our code example: method
 *         calling , lambda expressions etc.
 */
public class Phone implements Camera, Battery {

	@Override
	public String mah() {
		// TODO Auto-generated method stub
		return "5000";
	}

	@Override
	public String company() {
		// TODO Auto-generated method stub
		return "Samsung";
	}

	@Override
	public void megaPixel() {
		// TODO Auto-generated method stub
		System.out.println("48");
	}
	public int num(int a , int b) {
		return a+b;
	} 

	public static void main(String args[]) {
		// jre -> Java Run Time Environment ->code is activated from here
		Phone p = new Phone();
		System.out.println(p.mah());
		System.out.println(p.company());
		p.megaPixel();
		
		// use of BiFunction 
		BiFunction<Integer,Integer, Integer> objofBi = new Phone()::num;
		System.out.println(objofBi.apply(20, 20));
		
	}

}
