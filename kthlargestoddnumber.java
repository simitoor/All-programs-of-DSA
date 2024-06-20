public class kthlargestoddnumber {
   
        public static void main(String[] args) {
          int k=2;
          int r=3;
          int l=-3;
          int n=r;
          if(r%2==0)
          {
           n=r-1;
          }
       int flag=0;
          if(k>1){
           while(k-1>0)
           {
               n=n-2;
               if(n<l)
               {
                   flag=1;
                   break;
               }
               k--;
           }
   
          }
          if(flag==1)
          {
           System.out.println("0");
          }
          else{
           System.out.println(n);
          }
       }
   }
   

