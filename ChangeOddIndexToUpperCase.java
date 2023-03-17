package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		//pseudo code
		String test="changeme";
		char[] c= test.toCharArray();
		for (int i = 0; i < c.length; i++) {
			
			if (i%2!=0) {
				
				char c1 = Character.toUpperCase(c[i]);
				System.out.println(c1);
				
			}else {
				System.out.println(c[i]);
			}
		}
		
		
	}

}
