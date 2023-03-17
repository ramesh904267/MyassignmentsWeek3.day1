package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class PrintDuplicate {

	public static void main(String[] args) {

		Integer[] a={14,12,13,11,15,14,18,16,17,19,18,17,20};	
		
		List<Integer> num=new ArrayList<Integer>(Arrays.asList(a));
		
		Collections.sort(num);
		System.out.println(num);
		for (int i = 0; i < num.size(); i++) {
			for (int j = i+1; j < num.size(); j++) {
				if (num.get(i)==(num.get(j))) {
					System.out.println(num.get(i));
					
				}
			}
			
		}
		
		
	}
}
