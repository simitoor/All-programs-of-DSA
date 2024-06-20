public class shallowanddeepcopy {
     
        public static void main(String ars[])
        {
          real p1=new real();
          p1.arr[0]=4;
          p1.arr[1]=5;
         real p2=new real(p1);
         p1.arr[1]=3;
         for(int i=0;i<2;i++)
         {
            System.out.println(p2.arr[i]);
         }
        }
    }
class real
{
    String s;
     int arr[]=new int[2];
    real()
    {
      
    }
    real(real p1)
    {
        this.arr=p1.arr;
    }//shallow copy or copy constructors
  /*   real(real p1)
    {
       for(int i=0;i<arr.length;i++)
       {
        this.arr[i]=p1.arr[i];
        
       }
       
    }  deep copy*/
  

}
