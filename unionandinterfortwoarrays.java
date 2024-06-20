import java.util.HashSet;

public class unionandinterfortwoarrays {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet <Integer> s=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            s.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            s.add(arr2[i]);
        }
        System.out.println(s.size());
        s.clear();
        for(int i=0;i<arr2.length;i++)
        {
            s.add(arr2[i]);
        }
        int countinter=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(s.contains(arr1[i]))
            {
                System.out.println(arr1[i]);
                countinter++;
            }
        }
        System.out.println(countinter);
    }
}
