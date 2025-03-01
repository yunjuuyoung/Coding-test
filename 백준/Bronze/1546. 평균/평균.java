import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        float score[] = new float[N];
        float result = 0;


        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);

        float M = score[score.length - 1];

        for (int i = 0; i < score.length; i++) {
            result += (score[i]/M) * 100;
        }

        System.out.println(result/N);
    }
}