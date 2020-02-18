package challenge;

public class PrimitiveTypesChallenge {

	public static void main(String[] args) {

		byte a = 10;
		short b = 20;
		int c = 50;
		long d = 10 * (a+b+c) + 50000;
		System.out.println(d);
		
		short shortTotal = (short)(1000 + 10 * (a+b+c));
	}

}
