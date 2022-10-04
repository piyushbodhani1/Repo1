package lambda;



public class LambdaExpression {
	public int operate(int a, int b, MathOperation mathoperation){
	    return mathoperation.operation(a, b);
	}
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		LambdaExpression test = new LambdaExpression();
        
        MathOperation addition = (int a,int b) -> a+b;
        
        MathOperation subt = (a, b) -> a-b;
        
        MathOperation mul = (int a,int b) -> {return a*b;};
        
        MathOperation div = (int a,int b) -> a/b;
        
        System.out.println(test.operate (1,2,addition));
        System.out.println(test.operate (3,2,subt));
        System.out.println(test.operate (5,2,mul));
        System.out.println(test.operate (10,2,div));
        
        
        
    
    }
}
