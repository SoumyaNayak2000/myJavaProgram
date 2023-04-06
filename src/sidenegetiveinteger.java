import java.util.Scanner;

public class sidenegetiveinteger {
    static void neghetiveInteger(int arr[],int n){
            int i=0;
            int j=0;
            int temp;
           for (j=0;j<n;j++){
                if(arr[j]<0){
                    Swap(arr, i, j);
                    i++;
                }
            }
    }
    private static void Swap(int[] arr, int p1, int p2) {
        int temp;
        temp= arr[p1];
        arr[p1]= arr[p2];
        arr[p2]=temp;
    }
    static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        neghetiveInteger(arr,n);
        printArray(arr,n);
    }
}
