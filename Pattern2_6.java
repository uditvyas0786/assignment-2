class Pattern2_6
{
public static void main(String args[])
     {
  	 int i, j, k ;
	 for(i=0; i<=5; i++)
	{
	 for(j=0;j<=i;j++)
	{
	System.out.print(" ");
	}
	for(k=0; k<=2-i-1; k++)
	{
	System.out.print("*" + " ");
	}
	System.out.println();
        
}
}
}