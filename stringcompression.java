
class stringcompression
{
   public static void main(String []arr)
    {
     String a="aabbbcccddd";
     String b="";
     for(int i=0;i<a.length();i++)
     {
      Integer count=1;
      while(a.charAt(i)==a.charAt(i+1) && i<a.length()-1)
      {
        count++;
        i++;
      }
      b=b+a.charAt(i);
      if(count>1)
{
    b=b+count.toString();
}
     }
for(int i=0;i<b.length();i++)
{
   System.out.print(b.charAt(i));
}
     
}
}



