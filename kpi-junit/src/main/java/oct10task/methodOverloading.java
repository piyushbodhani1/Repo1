package oct10task;

/**
 * @author PiyushBodhani
 *
 */
public class methodOverloading {
	public static String name(String name) {
		return name;
	}

	public static String name(String name, String lastname) {
		return name + lastname;
	}

	public static String name(String name, String midName, String LastName) {
		return name + midName + LastName;
	}

	public static void main(String args[]) {
		System.out.println(name("Piyush"));
		System.out.println(name("Piyush", "Bodhani"));
		System.out.println(name("Piush", "M", "Bodhani"));
	}
}
