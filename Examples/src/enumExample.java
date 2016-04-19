
public class enumExample {
	public enum example{
		kevin(16, "how are you");
		
		private final String mssg;
		private final int age;
		
		private example(int a, String m){
			age = a;
			mssg = m;
		}
		
		public int getAge(){
			return age;
		}
		
		public String getMssg(){
			return mssg;
		}
	}	
//Shonne is the sexiest man alive!!
}
