package practiceProblems;

public class Multiplicationtable {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 12; i++) {
			System.out.println("=================");
			for(int j = 1; j <= 12; j++) {
		
	//		System.out.printf("%d * %d = %d\n", i, j, i*j);
				int sum =i*j;
				System.out.println(i*j);
		}
	}

}
}
