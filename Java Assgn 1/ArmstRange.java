class ArmstRange
{
	public static void main(String []args)
	{
		int temp,dig,sum;
		for(int i=100;i<=999;i++)
		{
			temp=i;
			sum=dig=0;
			while(temp>0)
			{
				dig=temp%10;
				sum+=(dig*dig*dig);
				temp/=10;
			}
			if(sum==i)
				System.out.println(i);
		}
	}
}