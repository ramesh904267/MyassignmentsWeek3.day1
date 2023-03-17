package week3.day2;

import java.util.Arrays;

public class ListMissingElements {

	public static void main(String[] args) {
		
		int []a= {9,1,2,3,4,7,6,8};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			
			if (i+1!=a[i]){
				 System.out.println(i+1);
				 break;
				 
			}
			
		}
		

	}

}
