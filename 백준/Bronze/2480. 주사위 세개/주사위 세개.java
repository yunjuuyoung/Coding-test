import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num[] = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(num);
        
        if (num[0] == num[1] && num[0] == num[2]) {
            System.out.println(10000 + num[0] * 1000);
        } else if (num[0] != num[1] && num[0] != num[2] && num[1] != num[2]) {
            System.out.println(num[2] * 100);
        } else {
            if (num[0] == num[1])
                System.out.println(1000 + num[0] * 100);
            else if (num[0] == num[2])
                System.out.println(1000 + num[0] * 100);
            else
                System.out.println(1000 + num[1] * 100);
        }
    }
}