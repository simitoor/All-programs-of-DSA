public class keypadcomb
{
    final static char[][]L= {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    public static void combination(String s)
    {
        int len=s.length();
        if(s=="")
        {
            System.out.print("");
            return;
        }
        keypad(0,len,new StringBuilder(),s);
    }
    public static void keypad(int pos,int len,StringBuilder d,String s)
    {
        if(pos==len)
        {
            System.out.println(d.toString());
            return;
        }
        else{
            char letters[]=L[Character.getNumericValue(s.charAt(pos))];
            for(int i=0;i<letters.length;i++)
            {
            keypad(pos+1, len, new StringBuilder(d).append(letters[i]), s);
            }
        }
    }
    public static void main(String args[]){
       combination("23");
    }
}