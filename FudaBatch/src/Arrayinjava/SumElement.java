package Arrayinjava;

public class SumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {11,15,4,10,6,17,3};
		int no=25;
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				temp=arr[i]+arr[j];
				if(no==temp) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
		
		
		
	}

}
