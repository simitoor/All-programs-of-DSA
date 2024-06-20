

public class Convertinglettersintouppercase{
    public static void main(String arr[])
    {
        String str="hi, i am simar ";
        char ch;
        StringBuilder sb=new StringBuilder("");
   ch=Character.toUpperCase(str.charAt(0));
       sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            ch=str.charAt(i);
            
            if(ch==' ' && i<str.length()-1)
            { 
                sb.append(ch);
                ch=Character.toUpperCase(str.charAt(i+1));
                sb.append(ch);
                i++;    
            }
            else{
                sb.append(ch);
            }
        }
        sb.toString();
        System.out.println(sb);
    }


       
}
