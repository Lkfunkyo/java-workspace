public class FileFormats {
	private String[] data;
	private static String newData = "";

	public FileFormats(String[] d) {
		data = d;
	}

	public void setMemberData() {
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				
				newData += String.format("%s", i);
				newData += data[i];
				newData += "\n";
				
				
			}
			
			
		}
	}

	public void setNormal() {
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
					
				newData += data[i];
				newData += " ";
				
				if(i % 8 == 0)
					newData += "\n";
			}
		}
	}
	
	public String formattedString() {	
		
		
		return newData;
	}
}

// memberInfo.format("ID: \t %s, \t Name: %s, %s \t age: %s" + "\n", ID, last,
// first, age);