import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

        int n = 5;
        boolean k=false;
        int[] arr = new int[5];
        for(int i=1;i<=n;i++){
                k=true;
            for(int j=1;j<=9;j++){
                if(j>=6-i && j<=4+i && k) {
                    System.out.print("*");
                    k=false;
                }
                else{
                    System.out.print(" ");
                    k=true;
                }
            }
            System.out.println();
        }
    }
}
