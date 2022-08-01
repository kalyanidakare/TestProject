package WrapperClassesDemo;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20;
Integer i1=new Integer(a);//boxing
Integer i2=a;
Integer it=100;

System.out.println(i1==i2);//memory location same strings//false logic
System.out.println(i1.equals(i1));//content //true logic

int i=it.intValue();//

int a1=it;//auto unboxing

Float f=new Float(200.5f);

float f1=f;//respective primitive data type

short s=f.shortValue();
long l=f.longValue();
int b=f.intValue();
byte b1=f.byteValue();
double d=f.doubleValue();

	}

}
