import java.util.Scanner;


public class Palindrome {
    public static  void palindrome(String str1)
    {
        int n=str1.length(),flag=0;
        for(int i=0;i<n/2;i++)
        {
            if(str1.charAt(i)==str1.charAt(n-i-1))
            {
                flag=1;
                continue;
            }
    else{
        flag=0;
break;
    }
        }
        if (flag==1) {
            System.out.print("It is palindromic");

        }
        else{
            System.out.print("It is not palindromic");
        }
    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
       String name;
        name=sc.next();
     palindrome(name);
     sc.close();  

    }
}
