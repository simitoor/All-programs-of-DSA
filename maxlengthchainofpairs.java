import java.util.*;

public class maxlengthchainofpairs {
    public static void main(String[] args) {
        int arr[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
        int maxact=1;
        int lastact=arr[0][1];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][0]>=lastact)
            {
                maxact++;
                lastact=arr[i][1];
            }
        }
        System.out.println(maxact);
    }
}
