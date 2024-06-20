import java.util.Arrays;
public class Lexicographicallysmallest {
    public static void lexi(int n,int k)
    {
      Character a[]=new Character[n];
      Arrays.fill(a,'a');
      for(int i=n-1;i>=0;i--)
      {
        k-=i;
         if(k>=0)
          {
            if(k>26)
            {
                a[i]='z';
                k-=26;
            }
            else{
                a[i]=(char)(k+97-1);
                k-=a[i]-'a'+1;
            }
          }
          else
          break;
          k=k+i;
      } 
      for(int i=0;i<a.length;i++)
      {
      System.out.println(a[i]);
      }  
    }
    public static void main(String[] args) {
        int n=5,k=42;
        lexi(n,k);

    }
}
