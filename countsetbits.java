

public class countsetbits {
    
        public static int getbit(int num,int j) {
       num=num&1;
    if(num==1)
    {
        j++;
    }
    return j;
}
public static void setbit(int num,int target)
{
    target=1<<target;
    num=num|target;
    System.out.print(num);
  }
  public static int clearlastibits(int num,int i)
  {
      i=-1<<i;
      num=num&i;
      return num;
  }
  public static int updateibit(int num,int i,int newbit )
  {
    //num=clearbit(10,2);
    int bitmask=newbit<<i;
    return num|bitmask;
  }
  public static int removerangebits(int num,int i,int j)
  {
     int a=(-1)<<(j+1);
     int b=~((-1)<<i);
     int num1=a|b;
     num1=num1&num;
     return  num1;
  }
  public static void powerof(int num)
  {
     num=num&(num-1);
     if(num==0)
     {
        System.out.print("It is power of 2");
     }
     else{
        System.out.print("It is not power of 2");
     }
  }
      public static void main(String []args)
    {
    int num=9,j=0;
    while(num>0)
    {
       j=getbit(num,j);
       num=num>>1;
    }
    System.out.print(j);
    }
}
