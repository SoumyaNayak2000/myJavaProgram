import java.util.Scanner;

public class squiredsorted {
    public static int[] squaredSorted(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];  // array to store the squared and sorted output

        // initialize left and right pointers
        int left = 0;
        int right = n - 1;

        // iterate until left is less than or equal to right
        int i = 0;
        while (left <= right) {
            if (arr[left] < 0) {
                // arr[left] is negative, so square and append to result array
                result[i++] = arr[left] * arr[left];
                left++;
            } else if (arr[right] > 0) {
                // arr[right] is positive, so square and append to result array
                result[i++] = arr[right] * arr[right];
                right--;
            } else {
                // both arr[left] and arr[right] are non-negative
                // compare their squares and append the smaller one to the result array
                if (arr[left] * arr[left] < arr[right] * arr[right]) {
                    result[i++] = arr[left] * arr[left];
                    left++;
                } else {
                    result[i++] = arr[right] * arr[right];
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            squaredSorted(arr);
        }
    }
}
