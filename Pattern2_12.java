class Pattern2_12
{
  public static void main(String args[])
     {
         int i, j, k;
	 for(i=1; i<=5; i++)
	 {
	   for(j=5; j>=i; j--)
	   	{ 
	   	 System.out.print("*");
       	  	}
                 System.out.println();
	  }

            for(i=2; i<=5; i++)
           {
		for( j=1;j<=i;j++)
		{
	         System.out.print("*");
	        }
	         System.out.println();
	   }
	   
        } 
      

}
