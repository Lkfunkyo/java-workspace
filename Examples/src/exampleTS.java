
public class exampleTS {
	private int day; 
	private int month;
	private int year;
	
	public exampleTS(int m, int d, int y){
		day = d;
		month = m;
		year = y;
		
		System.out.printf("%s", this);
	}
	
	public void test(Time t){
		System.out.println(t);
	}

}
