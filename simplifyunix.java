import java.util.Stack;
public class simplifyunix {
    public static void simplify(Stack <String> sb,String d)
    {
        String res=" ";
        res+="/";
        for(int i=0;i<d.length();i++)
        {
            String dir="";
           while(i<d.length() && d.charAt(i)=='/')
           {
            i++;
           }
           while(i<d.length() && d.charAt(i)!='/')
           {
            dir+=d.charAt(i);
            i++;
           }
           if(dir.equals("..")==true)
           {
            if(!sb.isEmpty())
            {
                sb.pop();
            }
           }
            else if(dir.equals(".")==true)
            {
                continue;
            }
            else if(dir.length()!=0)
            {
                sb.push(dir);
            }
           
        }
        Stack <String> sol=new Stack<>();
        while(!sb.isEmpty())
        {
            sol.push(sb.pop());
        }
       while(!sol.isEmpty())
       {
        if(sol.size()==1)
        {
            res+=sol.pop();
        }
       else{
        res+=sol.pop()+"/";
       }
       }
       System.out.print(res);
     }
       public static void main(String[] args) {
        String d="/a//b//c//////d";
        Stack <String> sb=new Stack<>();
        simplify(sb,d);
       
    }
}
