class PyramidPattern5
{
public static void main(String args[])
   {   int n=9;
		for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
            for ( int j = i; j <= n; j++)          
            {
                System.out.print(j+" ");
            }
			
            for (int j = n-1; j >= i; j--)
            {               
                System.out.print(j+" ");            
            }
             
			 System.out.println();
}
}

}