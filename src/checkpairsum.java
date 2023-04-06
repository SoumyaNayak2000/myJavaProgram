import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class checkpairsum {
    static void printPairs(int arr[], int n, int x){
     for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] + arr[j] == x)
            System.out.println("(" + arr[i] + ", " + arr[j] + ")");
}

    static boolean checkingPair(int arr[], int n, int x)
    {
        for (int i = 0; i < (n - 1); i++) {
            for (int j = (i + 1); j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();


        if (checkingPair(arr, n, x)) {
            System.out.print("Pair found");
            printPairs(arr,n,x);
        }
        else {
            System.out.println("Pair not found");
        }
    }
}
/*for (int k = 0; k < (n - 1); k++) {
        for (int l = (k + 1); l < n; l++)
        if (arr[k] + arr[l] != x) {
        System.out.print("Pair not found");
        //System.out.println("(" + arr[i] + ", " + arr[j] + ")");
        }
        }*/