package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
	
		//pseudo Code
		Integer[] a= {3,2,11,4,6,7};	
		Integer[] b= {1,2,8,4,9,7};
		List<Integer> sec1=new ArrayList<Integer>(Arrays.asList(a));
		List<Integer>sec2=new ArrayList<Integer>(Arrays.asList(b));
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (sec1.get(i)==sec2.get(j)) {
					System.out.println("This number is"+sec1.get(i));
				}
			}
			
		}
		
		
		

	}

}
