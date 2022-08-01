package StringDemo1206;

public class StringBufferBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sbf=new StringBuffer("Java");//16 character
		
		sbf.append("Language");
		System.out.println(sbf);
		
		String s=new String("Java");
		s.concat("LAnguage");
		System.out.println(s);
		
		sbf.reverse();
		System.out.println(sbf);
		
		System.out.println(sbf.capacity());//16+4
	System.out.println(sbf.length());
	
	sbf.replace(5, 8, "LAN");//start index,end index,replacement
	System.out.println(sbf);
	
	sbf.delete(5, 8);//java Language
	System.out.println(sbf);
	
	sbf.deleteCharAt(5);//Java guage
	System.out.println(sbf);
	
	System.out.println(sbf.indexOf("av"));
	
	sbf.insert(5, "Lang");
	System.out.println(sbf);
	
	sbf.insert(6, 3.5f);
		System.out.println(sbf);
		
		sbf.setCharAt(3,'M');
		System.out.println(sbf);
	}

}
