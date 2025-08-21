package day06;

class FinalKeyword{
	final void show() {
		System.out.println("I am final show() method in base");
	}
}

final class FinalKeywordSubClass extends FinalKeyword{
//	void show() {
//		System.out.print("I am final show() method in subclass"); // not allowed to override because this method is final
//	}
	void greet() {
		System.out.println("I am greet() method in subclass"); // not allowed to override because this method is final		
	}
}


//class FinalKeyword1 extends FinalKeywordSubClass{ // not valid because class is already final and can't be inherited

//}

public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int twenty = 20;
		// twenty = 25; // wrong can't assign new value 
		System.out.println(twenty);
		
		FinalKeyword fk = new FinalKeyword();
		fk.show();
		
		FinalKeywordSubClass fk1 = new FinalKeywordSubClass();
		fk1.greet();
		
	}

}
