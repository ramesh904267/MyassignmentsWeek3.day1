package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SetsecondLargest {

	public static void main(String[] args) {
		Integer[] num = {3,2,11,4,6,7};
		
		List<Integer> lar=new ArrayList<Integer>(Arrays.asList(num));
		Collections.sort(lar);
		System.out.println(lar);
		int s2 = lar.size();
		System.out.println(lar.get(s2-2));
		
	}

}
