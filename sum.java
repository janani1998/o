class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=321,a,sum=0;
		while(n!=0)
		{
			a=n%10;
			n=n/10;
			sum=sum+a;
		}
		System.out.print(sum);
	}
}
