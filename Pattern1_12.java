class Pattern1_12
{
 public static void main(String args[])
       {
	int i, j, k;
	for(i=0; i<=4; i++)
 	 {
	   int num =1; for(j=4; j>i; j--)
	  {
	     System.out.print(" ");
	  }
	  for(k=0; k<=i; k++)
	  {
	    System.out.print((int) (num + j) + " ");;
	  }
	    System.out.println();
	  }
       }
}