package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
		FileWriter fw=null;
		File f=new File("D://Test.txt");//read() A 65

		
try {
		fw = new FileWriter(f);
		fw.write("Welcome to core java session ThinkQuotient");

        
	} catch (IOException e) {
		e.printStackTrace();
		
	}
finally
{
	System.out.println("File writer  closed");
	fw.close();//
}
}
	}


