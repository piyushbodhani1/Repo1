package oct10task;

public class ConsOverloading {
	ConsOverloading(){
		System.out.println("con1");
	}
	ConsOverloading(int a , int b){
		System.out.println(a+""+b);
	}
	ConsOverloading(String a , String b){
		System.out.println(a+""+b);
	}
	public static void main(String args[]) {
		ConsOverloading c = new ConsOverloading();
		ConsOverloading c1 = new ConsOverloading(0,0);
		ConsOverloading c2 = new ConsOverloading("P","D");
	}
}
