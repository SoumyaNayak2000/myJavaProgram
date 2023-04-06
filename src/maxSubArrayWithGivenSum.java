import java.util.Scanner;

public class maxSubArrayWithGivenSum {
   static void maxsumarray(int[] arr,int n,int s){
       int sum=0, count=1;
       for(int j=0;j<n;j++)
       { sum=0;
           for(int k=j;k<n;k++)
           {
               sum=sum+arr[k];//5 10 12
               if(sum==s)
               {
                   System.out.println(j+","+k);
                   count=count+1;
               }
           }
       }
       if(count<=1)
       {
           System.out.println("no subarray found");
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        maxsumarray(arr,n,s);
    }
}
//    int s=33;
//    int ch[]={1, 4, 20, 3, 10, 5};
