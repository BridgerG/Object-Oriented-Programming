package chapter10;

public class TestingThingsIamNotConfidentIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInteger a1 = new MyInteger(121);
		
		System.out.println(a1.getMyInteger());
		
		if (a1.isEven()) {
			
			System.out.print("Its even!\n");
			
		} else if (a1.isOdd()) {
			
			System.out.print("Its Odd!\n");
			
		}
		
		if (a1.isPrime()) {
			
			System.out.print("Its Prime!\n");
			
		}
		
		if (a1.equals(121)) {
			
			System.out.println("It Equals 121");
			
		}
		
		
		System.out.println(MyInteger.parseInt('t'));
		System.out.println(MyInteger.parseInt("h"));

		
	}

}
