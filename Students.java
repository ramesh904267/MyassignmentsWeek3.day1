package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("Student Id"+id);

	}

	public void getStudentInfo(int id,String name) {
		
		System.out.println("Student Id"+id);
		System.out.println("Student Name"+name);
		
		}
	
    public void getStudentInfo(String email,int PhNo) {
		
	 System.out.println("Student Email"+email);
     System.out.println("Student PhNo"+PhNo);
    
	}
    public static void main(String[] args) {
    	
    	Students dt=new Students();
    	dt.getStudentInfo(1117);
    	dt.getStudentInfo(4080,"Ramesh");
    	dt.getStudentInfo("abc@gamil.com",766612193);
		
	}
    
    
    
}

