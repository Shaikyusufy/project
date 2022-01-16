package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Appended {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data="...have a nice day";
		try {
FileWriter file=new FileWriter("E:\\filehandling\\Text1.txt",true);
file.write(data);
System.out.println("appended successfully");
file.close();
		}
		catch(IOException e)
		{
			System.out.println("error");
		}

	}

}
