package final450.Array;

public class mergeTwoSortedArrayWithoutUsingExtraSpaces {
    public static void mergeSortedArray(int arr1[],int arr2[]){
        int n= arr1.length;
        int m= arr2.length;
        int i=0;
        int j=0;         //     i
        //                  1,2,3,8,10,12
        //                  5,4,6,7,9
        while(i<=n-1 && j<=m-1){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                int temp=arr2[j];
                arr2[j]=arr1[i];
                arr1[i]=temp;

            }
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={7,8,9,10};
    }
}
