package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithresources {

	public static void main(String[] args) {
		FileInputStream fis=null;
		// TODO Auto-generated method stub
		//auto closable can be directlky written along with try
		//try with resources
		try {
//			fis=new FileInputStream("D://Test.txt");//read() A 65
			int i;
			while((i=fis.read())!=-1)//-1 mark end of the file
			{
				System.out.println((char)i);
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
//		fis.close();//

	}


	}

}
