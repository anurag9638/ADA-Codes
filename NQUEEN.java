import java.util.Scanner;
class NQUEEN
{
	public static void main(String Art3mis[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		int a=s.nextInt();
		if(a>3)
		{
			n=a;
		}
		else
		{
			System.out.println("Re-Enter the value of N");
			a = s.nextInt();
			n=a;
		}
		Solve(n);
		
	}
	public static void Solve(int n)   /// n  =  4
	{
		int k=1;
		int a[]=new int[n+1];
		a[k]=0;
		while(k>0)
		{	
			if(a[k]==n)
				a[k]=1;
			else
				a[k]++;
			if(check(a,n,k,a[k])==0)
			{	for(int i=1;i<=n;i++)
				{
					if(check(a,n,k,a[k])==0)
					{
						
						if(a[k]==n)
							a[k]=1;
						else
							a[k]++;

					}
					else if(check(a,n,k,a[k])==1)
					{	
						break;
					}
				}
			}
			if(check(a,n,k,a[k])==1)
			{
				if(k==n)
					break;
				else
				{
					k++;
					a[k]=0;
				}
			}
			else if(check(a,n,k,a[k])==0)
			{
				k=k-1;
			}
			
			
			
		}
		for(int i=1;i<=n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
	public static int check(int a[],int n,int row,int col)
	{
		int check=1;
		for(int i=1;i<row;i++)
		{
			if(a[i]!=0)
			{	if(a[i]==col || i+a[i]==row+col || i-a[i]==row-col)
				{	
					check=0;
					break;
				}
			}
	
		}
	

		return check;

	}
}