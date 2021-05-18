class Pattern1_10
{
 public static void main(String args[])
       {
	int i, j, k;
	for(i=0; i<=4; i++)
 	 {
	  int alphabet = 69; for(j=4; j>i; j--)
	  {
	     System.out.print(" ");
	  }
	  for(k=0; k<=i; k++)
	  {
	    System.out.print((char) (alphabet - k) + " ");
	  }
	    System.out.println();
	  }
       }
}