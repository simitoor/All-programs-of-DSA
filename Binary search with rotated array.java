

//import java.util.*;




class firsts {
  public static void search(int arr[],int target)
  {  int low=0,high=arr.length-1,mid=0;
   
  //  System.out.println("Element ");
    
    while(low<=high)
    {
      mid=(low+high)/2;
      if(arr[mid]==target)
      {
        System.out.println("Element found at"+ mid);
        return;
      }
      else if(arr[mid]>=arr[low])
      {
        if(target>=arr[low] && arr[mid]>target)
        {
          high=mid-1;
        }
        else{
          low=mid+1;
        }
      }
     else{
            if(arr[mid]<target && target<=arr[high])
            {
              low=mid+1;
            }
            else{
              high=mid-1;
            }
      }
    }
    System.out.println("Elemenent not there");
   }
   
  
    public static void main(String[] args) {
   int arr[]={5,6,7,0,1,2,3,4};
         search(arr,4);
 
       
      }
}