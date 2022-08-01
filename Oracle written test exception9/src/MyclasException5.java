import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyclasException5 {
	
	 void myMethod1() throws IOException{
		myMethod2();
		throw new IOException("Exception");
	}
	 void myMethod2() throws IOException{
		 myMethod3();
			throw new IOException("Exception");
	 }

	 void myMethod3(){
			File f=new File("D://Test.txt");//read() A 65
		    FileReader fr=null;
			FileWriter fw=null;

			
	try {
			fw = new FileWriter(f);
			fw.write("Welcome to core java session ThinkQuotient");

	        
		} catch (IOException e) {
			e.printStackTrace();
			
		}

		 }
	 public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

		 MyclasException5 m=new MyclasException5();
		 m.myMethod1();
		 m.myMethod2();
		 m.myMethod3();
}}