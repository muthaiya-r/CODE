import java.util.*;
class code1
{
    public static void main(String args[])
    {
	     int a;
		 int b;
         int i = 0;
         int c[] = new int[10];

         a = Integer.parseInt(args[0]); 
		 b = Integer.parseInt(args[1]); 
        //taking command line input
        while (a != 0)
        {
            i++;
            c[i] = a % b;
            a = a / b;
        }
        for (int j = i; j > 0; j--)
        {
            System.out.print(c[j]);
        }
	}
}