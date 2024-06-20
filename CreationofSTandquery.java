public class CreationofSTandquery {
    static int tree[];
    public static void init(int n)
    {
        tree=new int[4*n];
    }
    public static int bulid(int arr[],int i,int start,int end)
    {
        if(start==end){
        tree[i]=arr[start];
        return arr[start];}
        int mid=(start+end)/2;
        bulid(arr,2*i+1, start, mid);
        bulid(arr,2*i+2, mid+1, end);
        tree[i]=tree[2*i+1]+tree[2*i+2];
        return tree[i];
    }
    public static void updateutil(int i,int idx,int si,int sj,int diff)
    {
        if(si>idx || sj<idx)
        return;
        tree[i]+=diff;
        if(si!=sj)
        {
            int mid=(si+sj)/2;
            updateutil(2*i+1, idx, si,mid, diff);
            updateutil(2*i+2, idx,mid+1,sj, diff);
             return;
        }
    }
    public static void update(int arr[],int idx,int newValue)
    {
        int diff=newValue-arr[idx];
        arr[idx]=newValue;
        updateutil(0,idx,0,arr.length-1,diff);
    }
    public static int queryutil(int i,int si,int sj,int qi,int qj)
    {
       if( sj<=qi || qj<=si)
       return 0;
       else if(si>=qi && qj>=sj)
       return tree[i];
       else{
       int mid=(si+sj)/2;
       int left=queryutil(2*i+1, si,mid, qi,qj);
       int right=queryutil(2*i+2,mid+1, sj, qi,qj);
       return left+right;
       }
    }
    public static int query(int arr[],int i,int j)
    {
        int n=arr.length;
        return queryutil(0,0,n-1,i,j);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
          int n=arr.length;
          init(n);
          bulid(arr, 0, 0, n-1);
          
        System.out.print(query(arr,2, 5));
        update(arr, 2, 2);
        for(int i=0;i<tree.length;i++)
          {
            System.out.print(tree[i]+" ");
          }
    }
}
