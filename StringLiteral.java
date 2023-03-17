package week3.day2;

public class StringLiteral {

	public static void main(String[] args) {
		
		String s1="Testleaf";
		String s3="TestLeaf";
		//Instantiation
		
		String s2 = new String("Testleaf");
		//compare the String Value equals
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		//memory of the String ==
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		//find size of the String (index start from 0 ,1, 2)
		//length star from(1,2,3)
		int length = s1.length();
		System.out.println(length);
		// convert string to char 
		char[] charArray = s1.toCharArray();
		System.out.println(charArray);
		//to print the all character
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			
		}
			//Reverse String 
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.println(charArray[i]);
		}
				
		//to check last four word(leaf)
		boolean contains = s1.contains("leaf"); 
		System.out.println(contains);
		if (s1.contains("leaf")||s1.contains("Leaf")) {
			System.out.println("is prsent");
			
		}else {
			System.out.println("Not Present");
		}
		//find the Character
		char charAt = s1.charAt(7);
		System.out.println(charAt);
		
		//find the index
	int indexOf = s1.indexOf('s');
	System.out.println(indexOf);
	
	//sub String
	String s4="1-16 of over 100,000 results for";
	String substring = s4.substring(3);
	System.out.println(substring);
	String substring2 = s4.substring(12, 20);
	System.out.println(substring2);
			
			
			
		}
		
		
		
	}


