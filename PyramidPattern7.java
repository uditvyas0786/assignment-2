class PyramidPattern7
{
public static void main(String args[])
{	int num =10;
		for(int i=1;i<=9;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			num--;
			for(int k=9;k>=i;k--)
			{
				System.out.print(" "+ num);
			}
			System.out.println();
		}
	}
}