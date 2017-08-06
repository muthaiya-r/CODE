/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivin;

/**
 *
 * @author SYS
 */
import java.util.*;


class Decimal
{
    public static void main(String args[])
    { 
	   Scanner sc = new Scanner(System.in);
           int b = sc.nextInt();
	    int n = sc.nextInt();
            int i;
		
		 ArrayList nevin = new ArrayList();
		for(i=n;i<=32768;i++)
		{ 
			int e[]=new int[50];
			e=base(b,i);
                        System.out.println("base"+e);
			int f=sumofdigits(e);
                        System.out.println("sum of digits"+f);
			
	       if(i%f == 0)
		   {
			   if(nevin.size()<=n)
			   {
				    nevin.add(i);
                                    
			   }
			   else
			   {
				nevin.clear();   
			   }
		  }
        else
		{  
            if(nevin.size()==n)	
			{
				   System.out.println(nevin.get(1));
			}
		    else
			{
		    nevin.clear();
		    }
	    }
	}
    }
      public static int[] base(int b,int i)
	   {
        int c[] = new int[10];
        int e[]=new int[10];
        
		int x=0;
        while (i != 0)
        {
            
            c[x] = i% b;
            i= i / b;
            x++;
        }
        for (int j = 1,k=0; j > 0; j--)
        {
           e[k]=c[j];
		   k++;
        }
       return(e);
	   }
		public static int sumofdigits(int[] e)
		{
                   int c[]=new int[50];
                   int i;
			int sum=0;
			for(i=0;i<10;i++)               
                        {
                        sum=sum+c[i];
		         }
		return(sum);
		}
}
    

    