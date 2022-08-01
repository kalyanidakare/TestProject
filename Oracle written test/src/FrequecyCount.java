
public class FrequecyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1234,temp;
		temp=num;
		
		for(int i=0;i<=9;i++)
		{
		int cnt=0;	
		while(num!=0)
		{
			int r=num%10;
			if(r==i)
			{
				cnt++;
			}
			num=num/10;
		}
		num=temp;
		if(cnt>0)
			System.out.println(i+" "+cnt);
		}
	}

}
