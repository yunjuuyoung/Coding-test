import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int array[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int max = array[0][0];
        int index[] = {1, 1};
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    index[0] = i + 1;
                    index[1] = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(index[0] + " " + index[1]);
    }
}