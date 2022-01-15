import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter my=new FileWriter("E:\\filehandling\\Text.txt");
		my.write("File is created");
my.close();
System.out.println("succesfully created");
	}



	}


