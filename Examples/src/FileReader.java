import java.io.*;
import java.util.*;

public class FileReader {
	private int index;
	private File file;
	private static Scanner s;
	public String[] info = new String[10000000];
	public FileFormats fileContent = new FileFormats(info);
	private String choice;
	
	public FileReader(File e){
		file = e;
		
		
		try{
			s = new Scanner(file);
			
			while(s.hasNext()){
				info[index] = s.nextLine();
			    index++;
			}
			
			
		}
		catch(Exception r){
			System.out.println("Error reading file");
		}
		
	}
	
	
	public static void closeReader(){
		s.close();
	}
	
	public String fileData(String formatChoice){
		choice = formatChoice;
		
		if(choice == "memberFormat")
			fileContent.setMemberData();
		else if(choice == "setNormal")
			fileContent.setNormal();
		
		return fileContent.formattedString();
		
	}
		
}
