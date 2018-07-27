class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="Hello.world@123";
		String num=s.replaceAll("[^0-9]","");
		String alp=s.replaceAll("[^A-Za-z]","");
		if(num.length()!=0&&alp.length()!=0)
		System.out.print("yes");
		else
		System.out.print("No");
	}
}
