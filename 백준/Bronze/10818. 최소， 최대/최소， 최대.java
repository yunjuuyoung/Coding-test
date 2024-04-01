import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int input[] = new int[N];
        int max, min;
        
        for(int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        
        max = input[0];
        min = input[0];
        
        for(int i = 0; i < N; i++) {
            if(max < input[i])
                max = input[i];
            if(input[i] < min)
                min = input[i];
        }
        System.out.println(min + " " + max);        
    }
}