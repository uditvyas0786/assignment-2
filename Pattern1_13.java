class Pattern1_13
{
 public static void main(String args[])
       {
	int i, j, k;
	for(i=0; i<=4; i++)
 	 {
	  int alphabet = 65; for(j=4; j>i; j--)
	  {
	     System.out.print(" ");
	  }
	  for(k=0; k<=j; k++)
	  {
	    System.out.print((char) (alphabet + j) + " ");
	  }
	    System.out.println();
	  }
       }
}