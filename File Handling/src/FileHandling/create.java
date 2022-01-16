package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class create {

	public static void main(String[] args) throws IOException {
		FileWriter file=new FileWriter("E:\\filehandling\\Text1.txt");
		file.write("good morning every one");
		file.close();
		System.out.println("created sucessfuly complete");
}
}

