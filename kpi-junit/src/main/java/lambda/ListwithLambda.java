package lambda;
import java.util.ArrayList;

public class ListwithLambda {
  public static void main(String args[]) {
	  ArrayList<String> list = new ArrayList<>();
	  list.add("Mango");
	  list.add("Apple");
	  list.add("Grapes");
	  list.add("lichi");
	  list.add("JackFruit");
	  list.add("Strawberry");
	  
	  System.out.println("----Lambda-With-List-Iteration------");
	  list.forEach(fruits -> System.out.println(fruits));
	  ListTestLambda tfe = fruits -> System.out.println(fruits);
	  
  }
}
