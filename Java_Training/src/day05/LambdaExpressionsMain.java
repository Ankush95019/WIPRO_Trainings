package day05;

@FunctionalInterface
interface Calculator{
	double operation(double a, double b);
}

@FunctionalInterface
interface Multiplication{
	double multiply(double a,double b);
}


public class LambdaExpressionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// syntax for Lambda Expression in Java is (parameters List) -> {body}
		Calculator addition = (a,b) -> a+b;
		Calculator subtraction = (a,b) -> a-b;
//		Calculator subtraction = (a,b) -> a-b;
		System.out.println("Addition is:" + addition.operation(5, 7));
		System.out.println("Subtraction is:" + subtraction.operation(7, 5));
//		System.out.println("Subtraction is:" + subtraction.subtract(7, 5));		
		Multiplication multi = (a,b) -> a*b;
		System.out.println("Multiplication is:" + multi.multiply(7, 5));		
		
	}

}
