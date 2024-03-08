package chapter13;

public class MakinOctagons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Octagon o = new Octagon(8, "white", true);
		
		Octagon o2 = (Octagon) o.clone();
		
		System.out.print(o.compareTo(o2));
	}

}
