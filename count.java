import java.util.Scanner;
public class kcount {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int a[]=new int[n];
		int i,j,c=0;
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
				if(a[i]==k)
					c++;
			}
		System.out.println(c);
	}

}
