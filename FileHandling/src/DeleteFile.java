import java.io.File;

public class DeleteFile {
public static void main(String[] args)
{
	File f= new File("E:\\filehandling\\Text.txt");
	if(f.delete()) {
		System.out.println("file sucessfully deleted");
	}
	else {
		System.out.println("file not deleted");
	}
}
}
