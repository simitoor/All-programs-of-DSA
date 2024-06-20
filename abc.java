import java.util.Scanner;
class abc {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
          int n = sc.nextInt();
          int k= sc.nextInt();
          int[] first= new int[n];  
          int[] second= new int[n];  
for(int i=0; i<n; i++)  
{  
  first[i]=sc.nextInt();  
} 
for(int i=0; i<n; i++)  
{  
  second[i]=sc.nextInt();  
}
int a=0,max=0;
max+=first[0];
          for(int i=1;i<k;i++)
          {
              if(a+1<n && first[a+1]>=second[a])
              {
                  if(second[a+1]>=second[a])
                  {
                      max+=first[a+1];
                      a=a+1;
                  }
                  else{
                    max+=second[a]*(k-i-1);
                    max+=first[a+1];
                  }
              }
              else{
                  max+=second[a]*(k-i);
                  break;
              }
            
          }
          System.out.println(max);
           sc.close();
    }
   
}
6 4
1 4 5 4 5 10
1 5 1 2 5 1
