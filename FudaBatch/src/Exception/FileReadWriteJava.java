package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWriteJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=null;
		FileOutputStream fos=null;
		
try {
		fis=new FileInputStream("D://Test.txt");//read() A 65
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		
	} catch (IOException e) {
	e.printStackTrace();
}
finally
{
	System.out.println("Output stream closed");
	fis.close();//

}


	}}


