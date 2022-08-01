package Arrayinjava;

public class MissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,5,6,8,9,11,12};
		int count=1;
		for(int i=0;i<arr.length;) //i=0
		{
			if(arr[i]==count)//arr[i]=2
				
			{
//			count++;
				i++;
			}
			else
			{
				System.out.println(count);
//				count=count+2;
				count++;
			}
		}

	}

}
