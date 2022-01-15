import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file=new File("E:\\filehandling\\Text.txt");
if(file.createNewFile())
{
	System.out.println("file created sucessfully");
}
else
{
	System.out.println("file not created");
}

	}

}
