public class maxsubarray {
    public static int maxsubarraysum(int[] arr,int n,int k){

        int ans=0;
        for (int i=0;i<k;i++){
            ans=ans+arr[i];
        }
        int maxsum=ans;
        for(int i=k;i<n;i++) {
            maxsum = maxsum + arr[i] - arr[i - k];
            ans=Math.max(maxsum,ans);
        }
        return maxsum ;
    }
    public static void main(String[] args) {
        int n=10;
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int k=4;
        System.out.println(maxsubarraysum(arr,n,k));
    }
}
