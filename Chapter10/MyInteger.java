package chapter10;

public class MyInteger {

	int value = 0;
	
	MyInteger(int newInt) {
		
		value = newInt;
		
	}
	
	int getMyInteger() {
		
		return value;
		
	}
	
	boolean isEven() {
		
		if (value % 2 == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}	
	}
	
	boolean isOdd() {
		
		if (value % 2 == 1) {
			
			return true;
			
		} else {
			
			return false;
			
		}	
	}
	
	boolean isPrime() {
		
		for(int i = 2; i < value; i++) {
			
			if (value % i == 0) {
				
				return true;
			}
		}
		
		return false;
	}
	
	static boolean isEven(int newInt) {
		
		if (newInt % 2 == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}	
	}
	
	static boolean isOdd(int newInt) {
		
		if (newInt % 2 == 1) {
			
			return true;
			
		} else {
			
			return false;
			
		}	
	}
	
	static boolean isPrime(int newInt) {
		
		for(int i = 2; i < newInt; i++) {
			
			if (newInt % i == 0) {
				
				return true;
			}
		}
		
		return false;
	}
	
	static boolean isEven(MyInteger MyInteger) {
	
		return MyInteger.isEven();
		
	}
	
	static boolean isOdd(MyInteger MyInteger) {

		return MyInteger.isOdd();
		
	}
	
	static boolean isPrime(MyInteger MyInteger) {
		
		return MyInteger.isPrime();
		
	}
	
	boolean equals(int newInt) {
		
		if (newInt == value) {
			
			return true;
			
		}
		
		return false;
	}
	
	boolean equals(MyInteger MyInteger) {
		
		return MyInteger.equals(MyInteger);
		
	}
	
	static int parseInt(char character) {
		
		int i = Character.getNumericValue(character);
		
		return i;
		
	}
	
	static int parseInt(String string) {
		
		char a = string.charAt(0);
		
		int i = Character.getNumericValue(a);
		
		return i;
		
	}
}
