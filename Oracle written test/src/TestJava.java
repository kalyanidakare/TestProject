import java.util.Arrays;

public class TestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[]={1,2,3,4,5,6,7,8}
		//output=5,6,7,8,1,2,3,4
		int arr[]= {1,2,3,4,5,6,7,8};
		int size = arr.length-1;
		System.out.println(size);
		int pos = (arr.length/2);
		int temp=0;
		for(int i=0;i<(arr.length/2);i++)
		{
			System.out.println("Pos "+pos+"i ="+i);
			temp=arr[i];
			arr[i]=arr[pos]	;
			arr[pos]=temp;
			pos++;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
