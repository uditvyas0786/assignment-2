class PyramidPattern4
{
public static void main(String args[])
   {
		for(int i=1;i<=9;i++)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			for(int j=i;j>=2;j--)
			{
			  System.out.print((j-1)+" ");
		        }
			 System.out.println();
 		 } 
   }
	

}