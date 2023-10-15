import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n + 1];
        int m = input.nextInt();
        for (int i = 1; i < a.length; i++) {
            a[i] = i;
        }
        int p = 0, q = 0, index = 0, temp = 0;
        for (int i = 0; i < m; i++) {
            p = input.nextInt();
            q = input.nextInt();

            for (int j = 1; j < a.length; j++) {
                if (p == a[j]) {
                    index = j;
                    break;
                }
            }
            temp = a[index];
            if (q > 0) {
                for (int j = index + 1; j <= index + q; j++) {
                    a[j - 1] = a[j];
                }
            } else if (q < 0) {
                for (int j = index - 1; j >= index + q; j--) {
                    a[j + 1] = a[j];
                }
            }
            a[index + q] = temp;

        }
        for (int i = 1; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }

    }
}

