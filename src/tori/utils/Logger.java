package tori.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public final class Logger {
	public static String LogPath = "Output";
	public static String ScoreFile = "";
	public static void Print(String Message) {
		
		Print(Message, "Log.txt");
	 
		
	}
public static void Print(String Message, String fileName) {
		
		try {
			File f = new File(LogPath);
			if(!f.exists()){
				f.mkdir();
			}
			
			FileWriter fw = new FileWriter(LogPath + "/" + fileName, true);
			fw.write(System.getProperty( "line.separator" ));
			
			fw.write(Message);
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		
	}

}
