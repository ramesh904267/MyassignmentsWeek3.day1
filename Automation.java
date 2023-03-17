package week3.day1;

public class Automation extends MultipleLangauge implements Language,TestTool{

	public static void main(String[] args) {
		
		Automation auto=new Automation();
		auto.selenium();
		auto.java();
		auto.python();
		auto.ruby();
		
	}

	public void selenium() {
		System.out.println("Selenium is a Automation framework");
		
	}

	public void java() {
		System.out.println("java is mother lanagauge of selenium");
		
		
	}

	public void ruby() {
		System.out.println("ruby is  programming Language");
		
	}

	
	}

	
	
	
	


