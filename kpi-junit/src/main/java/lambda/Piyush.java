package lambda;

import java.util.ArrayList;

public class Piyush implements PiyushI{
	
    public static void main(String args[]) {
    	Piyush p = new Piyush();
    	ArrayList<Piyush> list = new ArrayList<Piyush>();
//    	list.add(p.name("Piyush"));
    	list.add(p.height());
    	list.add(p.weight());
    	list.forEach(details->System.out.println(details));
    	
	
    }
    String a= "Piyush";
    PiyushI p = a->a;
	
	public Piyush height() {
		System.out.println("5.9");
		return null;
	}
	public Piyush weight() {
		System.out.println("65");
		return null;
	}
	@Override
	public String name(String name) {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}
