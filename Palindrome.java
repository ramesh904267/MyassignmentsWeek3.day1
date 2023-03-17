package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String call="madam";
		String rev=" ";
		for (int i =call.length()-1; i >= 0; i--)		
				
				rev=rev+call.charAt(i); 
		{
			
}
		
			if (call.equalsIgnoreCase(rev)) {
				System.out.println("This is palindrome");
			}else {
				System.out.println("This is not Palindrome");
			}
		
		
		

	}

}
