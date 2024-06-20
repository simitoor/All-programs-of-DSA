/*
You are given a binary string and want to flip some bits of string and find the maximum number of 1s which can be obtained. When flipping the bits, you have to pick an interval (i,j) for which the bits will not be flipped, while all the other bits have to be flipped. You can pick one such interval. more formally, given a string input str of length str_size that consusts of only 0 s and 1s choose two indices i and j such that 1<=i<=j<= Str size and convert all 0a to 1s and 1s to 0s in the interval (1,i) and(j, str size) Find the number of 1s that can be obtained after performing the given operation. Note that this operation must be performed exactly once 
 */
public class Deshaw_Q1_flip_bits{
    public static int findMaxOnes(String str) {
      int n=str.length();
      int count=1,a=0,b=0,flag=0,max=0;
      for(int i=0;i<n-1;i++)
      {
        count=1;
        flag=0;
        if(str.charAt(i)=='1')
        {
            
            while(i<n-1 && str.charAt(i)==str.charAt(i+1) && str.charAt(i+1)=='1' )
            {
                count++;
                i++;
                flag=1;
               
            }
            if(max<count)
            {
                
                a=i-count+1;
                b=i;
                max=count;
            }
            if(flag==1)
            i--;
            
        }

      }
      for(int i=0;i<a;i++)
      {
        if(str.charAt(i)=='0')
        max++;
      }
      for(int i=b+1;i<n;i++)
      {
        if(str.charAt(i)=='0')
        max++;
      }
      if(max==0)
      {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            max++;
        }
      }
      return max;
    }

    public static void main(String[] args) {
        String str = "10110111";
        int maxOnes = findMaxOnes(str);
        System.out.println("Maximum number of 1s after flipping: " + maxOnes);
    }
}
