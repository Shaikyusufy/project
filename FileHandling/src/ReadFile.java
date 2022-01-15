import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "E:\\filehandling\\Text.txt";
		try {
		    FileReader fr = new FileReader(path);
		    BufferedReader h = new BufferedReader(fr);
		    String Data = h.readLine();
		    while(Data != null) {
		        System.out.println(Data);
		        Data = h.readLine();
		    }
		    h.close();
		} catch (Exception ex) {
		}
	}

}
