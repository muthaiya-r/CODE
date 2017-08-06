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
class decimall
{
    public static void main(String args[])
    {
       int i=0; 
       int b;
        int d[]=new int[50];
         int k;
         int j;
       
       Scanner in=new Scanner(System.in);
       b=in.nextInt();
       
       for(int a=10;a<=12;a++)
       {
        int sum=0;
        int c[] = new int[10]; 
         
         
         //a=in.nextInt();
          
        int c1=a;
        while (a != 0)
        {
            i++;
            c[i] = a % b;
            a = a / b;
            
            
        }
        for (j = i; j > 0; j--)
        {
            System.out.println(c[j]);
            
        }
        
			for(j=0,k=0;j<=i;j++)
                        {
                            d[k]=c[j];
                            sum=sum+d[k];
                            k++;
                            
                        }
               
            
            System.out.println("sum os"+sum);
            a=c1;
        
	
}
}
}

