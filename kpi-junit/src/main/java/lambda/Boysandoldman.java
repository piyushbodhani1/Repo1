package lambda;

import java.util.Scanner;

public class Boysandoldman {

	String condition(int IQ, int talkingRating) {
		if (IQ < 50 && talkingRating < 6) {
			return "Unstable";
		}
		return "Stable";

	}

	public static void main(String args[]) {
		Boysandoldman bd = new Boysandoldman();
		Scanner sc = new Scanner(System.in);
		int n = 4;
		int o1 = 4;
		for (int i = 0; i < n; i++) {
			System.out.println("Boy no:-" + i);
			System.out.println("Enter the IQ:-");
			int IQ = sc.nextInt();
			System.out.println("Enter the manner:-");
			int talkinRating = sc.nextInt();
			System.out.println(bd.condition(IQ, talkinRating));
		}
		for (int j = 0; j < o1; j++) {
			System.out.println("Old MAn No" + j);
			System.out.println("Enter the IQ:-");
			int IQ = sc.nextInt();
			System.out.println("Enter the manner:-");
			int talkinRating = sc.nextInt();
			System.out.println(bd.condition(IQ, talkinRating));
		}

	}
}
