/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.ArrayList;

/**
 *
 * @author Barani
 */
public class primee {
 
        public static void main(String[] args) {
            ArrayList<Integer> al=new ArrayList<>();
            
            ArrayList<Integer> at=new ArrayList<>();
            
               
                //define limit
                int limit = 10;
               
                System.out.println("Prime numbers between 1 and " + limit);
               
                //loop through the numbers one by one
                for(int i=2; i < 10; i++){
                       
                        boolean isPrime = true;
                       
                        //check to see if the number is prime
                        for(int j=2; j < i ; j++){
                               
                                if(i % j == 0){
                                        isPrime = false;
                                        break;
                                }
                        }
                        // print the number
                        if(isPrime)
                        {
                               
                        
                       al.add(i);
                       
         
                        }
                      
                        
                        
                        
                        
                        
                        
                        
                }
                 int  n=al.size();
                for(int k=0;k<n;k++)
                        {
                        System.out.print("\t"+al.get(k));
                        }
                
                
                for(int l=0;l<al.size();l++)
                {
                    for(int m=l+1,o=0;m<al.size();m++)
                    {
                     at.add(Integer.parseInt(Integer.toString(al.get(l))+Integer.toString(al.get(m))));
                      at.add(Integer.parseInt(Integer.toString(al.get(m))+Integer.toString(al.get(l))));
                    }
                     at.add(Integer.parseInt(Integer.toString(al.get(l))+Integer.toString(al.get(l))));
                    
                }
                
               int  count1=0;
                for(int t=0;t<at.size();t++)
                {int count=0;
                    
                    int tmp=at.get(t);
                    System.out.println("tnp"+tmp);
                    
                    for(int z=2;z<=tmp/2;z++)
                    {
                       if(tmp%z==0)
                       {
                           count=1;
                           break;
                       }
                    
                    }
                     if(count==0)
                    {
                        count1++;
                    }
                    
                   
                }
                
               System.out.println("count"+count1);
                
                
                
                
                
        } 
        
        
                
                

}