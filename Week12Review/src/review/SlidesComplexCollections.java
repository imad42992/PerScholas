package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidesComplexCollections {

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(3, 4, 6, 7, 9, 12, 15, 17, 23);
		List<Integer> b = Arrays.asList(3, 5, 7, 9, 10, 13, 15, 18, 23);
		List<Integer> c = new ArrayList<Integer>();

		for (int item : a) {
			if (b.contains(item)) {
				c.add(item);
			}
		}
		System.out.println(c);

	}
}