package javainterview.question;

public class Test1 {

	private String name;
	private static String school = "TEK";
	private static int count = 0;

	public Test1() {
		super();
		this.name = "";
		
		count++;
	
	}

	public String getName() {
		return name;
	}
	
	public static void printCount() {
		System.out.println(count);
	}
	
	public  String getSchoolname () {
		return school;
	}
	
	 
	public String getFullName() {
		return "name: " + name+","+school;
	}
	 
}
