
import java.util.*;
public class targetdifference {
   public static boolean findPair(int arr[],int n)
    {                                                               //0 1 2 3 4
        int size = arr.length;  // =5                               //1 2 7 9 11
        // Initialize positions of two index
        int i = 0, j = 1;

        // Search for a pair
        while (i < size && j < size)    //0<5,1<5
        {
            if (i != j && (arr[j] - arr[i] == n || arr[i] - arr[j] == n))
            {
                System.out.print("Yes");
                return true;
            }
            else if (arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }

        System.out.print("No");
        return false;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int T = sc.nextInt();
        findPair(arr,N);

    }
}

//1 2 7 9 11