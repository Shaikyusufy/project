package FileHandling;

import java.io.File;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\filehandling\\Text2.txt");
		file.canWrite();
		if(file.createNewFile()) {
			System.out.println("file successfully created");
		}else {
			System.out.println("fine not created");
		}
	}

}
