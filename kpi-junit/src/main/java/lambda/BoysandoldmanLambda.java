package lambda;

public class BoysandoldmanLambda {
	public int operate(int a, int b, BoysandOldmanInterface mathoperation) {
		return mathoperation.mentalTest(a, b);
	}

	public static void main(String args[]) {

		int boy1IQ = 50;
		int boy1Sense = 20;
		int boy2IQ = 20;
		int boy2Sense = 7;
		int boy3IQ = 10;
		int boy3Sense = 10;
		int boy4IQ = 10;
		int boy4Sense = 10;
		
        
		BoysandoldmanLambda obj1 = new BoysandoldmanLambda();
		
		
         // LAMBDA Function use
		BoysandOldmanInterface grade = (a, b) -> a + b;

		// for boy1
		if (obj1.operate(boy1IQ, boy1Sense, grade) >= 50) {
			System.out.println("boy 1 Stable & Released");
		} else if (obj1.operate(boy1IQ, boy1Sense, grade) < 50) {
			System.out.println("Unstable");
		}

		// for boy2
		if (obj1.operate(boy2IQ, boy2Sense, grade) >= 50) {
			System.out.println("boy 2 Stable & Released");
		} else if (obj1.operate(boy2IQ, boy2Sense, grade) < 50) {
			System.out.println("Unstable");
		}

		// for boy3
		if (obj1.operate(boy3IQ, boy3Sense, grade) >= 50) {
			System.out.println("boy 3 Stable & Released");
		} else if (obj1.operate(boy3IQ, boy3Sense, grade) < 50) {
			System.out.println("Unstable");
		}

		// for boy4
		if (obj1.operate(boy4IQ, boy4Sense, grade) >= 50) {
			System.out.println("boy 4 Stable & Released");
		} else if (obj1.operate(boy4IQ, boy4Sense, grade) < 50) {
			System.out.println("Unstable");
		}

		int old1IQ = 20;
		int old1Sense = 20;
		int old2IQ = 10;
		int old2Sense = 5;
		int old3IQ = 70;
		int old3Sense = 20;
		int old4IQ = 10;
		int old4Sense = 20;

		// for oldman1
		if (obj1.operate(old1IQ, old1Sense, grade) >= 50) {
			System.out.println("old man 1 Stable & Released");
		} else if (obj1.operate(old1IQ, old1Sense, grade) < 50) {
			System.out.println("Unstable");
		}

		// for oldman1
		if (obj1.operate(old2IQ, old2Sense, grade) >= 50) {
			System.out.println("old man 2 Stable & Released");
		} else if (obj1.operate(old2IQ, old2Sense, grade) < 50) {
			System.out.println("Unstable");
		}
		// for oldman2
		if (obj1.operate(old3IQ, old3Sense, grade) >= 50) {
			System.out.println("old man 3 Stable & Released");
		} else if (obj1.operate(old3IQ, old3Sense, grade) < 50) {
			System.out.println("Unstable");
		}
		// for oldman4
		if (obj1.operate(old4IQ, old4Sense, grade) >= 50) {
			System.out.println("old man 4 Stable & Released");
		} else if (obj1.operate(old4IQ, old4Sense, grade) < 50) {
			System.out.println("Unstable");
		}
		
		
		
	//	System.out.println("The two people who will bw released are:-");
		

	}
}
