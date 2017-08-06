
import java.util.*;
public class pal {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        String st=in.nextLine();
        ArrayList<String> res=permutation(st);
        System.out.println(res);
        String result=palindrome(res);
        System.out.println(result);
        
    }
     public static ArrayList<String> permutation(String st)
    {
       ArrayList<String> res=new ArrayList<String>();
       if(st.length() ==1)
       {
           res.add(st);
           
       }else if(st.length()>1)
       {
           int lastIndex=st.length() -1;
           String last=st.substring(lastIndex);
           String rest=st.substring(0,lastIndex);
           res=merge(permutation(rest),last);
       }
       return res;
    }
     public static  ArrayList<String> merge(ArrayList<String> list,String c){
        ArrayList<String> res =new ArrayList<String>();
        for(String st : list){
            for(int i=0;i<=st.length();++i)
            {
                String ps=new StringBuffer(st).insert(i,c).toString();
                res.add(ps);
            }
        }
        return res;
    }
     public static String palindrome(ArrayList<String> ba){
         String result="";
         
         for(String st: ba)
         {
             String rev="";
             for(int i=(st.length()-1);i>=0;i--)
             {
                 rev +=st.charAt(i);    
             }
             result= rev;
               
         }
         return result;
     }
     
}

     
     

    

    


