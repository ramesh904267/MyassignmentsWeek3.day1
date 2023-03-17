package week3.day1;

public class AxisBank extends BankInfo {
	
	public void depoist(int b) {
	
		System.out.println("DepoistAmount"+b);

	}
	public static void main(String[] args) {
		
		AxisBank ac=new AxisBank();
		ac.depoist(1000);
		ac.savings();
		ac.fixed();
	}
	
	}
	
	


