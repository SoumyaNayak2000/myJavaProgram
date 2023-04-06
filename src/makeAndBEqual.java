import java.util.Scanner;

public class makeAndBEqual {
    static int making_a_and_b_equal(int[] arr,int[] brr,int n){
        int x=0;
        int y=0;
        int z=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                x++;
            }
        }
        for(int i=0;i<brr.length;i++){
            if(brr[i]==1){
                y++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=brr[i]){
                z++;
            }
        }
        int move=Math.min(z,Math.abs(x-y)+1);
        return move;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        System.out.println(making_a_and_b_equal(arr,brr,n));
    }
}
