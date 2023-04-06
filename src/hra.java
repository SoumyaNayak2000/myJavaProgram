import java.util.Scanner;
public class hra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hra;
        int da;
        int total;
        if (n <= 10000) {
            hra = n * 20 / 100;
            da = n * 80 / 100;
            total = n + hra + da;
            System.out.println(total);
        } else if (n > 10000 && n <= 20000) {
            hra = n * 25 / 100;
            da = n * 90 / 100;
            total = n + hra + da;
            System.out.println(total);
        } else if (n > 20000) {
            hra = n * 30 / 100;
            da = n * 95 / 100;
            total = n + hra + da;
            System.out.println(total);
        }
    }
}
