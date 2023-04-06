import java.util.Scanner;

public class findMissingElement {
    static int sumOfNelements(int N){
        int sum= N * (N + 1) / 2;
        return sum;
    }
    static void findMissing(int[] arr,int sum) {
       // int sumofarray = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        System.out.print(sum);

// 1 2 3 4 5=15
        //1 2 4 5->traverse
        //15-1=14
        //14-2=12
        //12-4=8
        //8-5=3
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n-1];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }
        int sum=sumOfNelements(n);
        findMissing(a,sum);
    }
}
