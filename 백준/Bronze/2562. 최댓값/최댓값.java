import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int array[] = new int[9];
        int index = 1;
        
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        int value = array[0];
        for (int i = 1; i < array.length; i++) {
            if (value <= array[i]) {
                value = array[i];
                index = i + 1;
            }
        }
        
        System.out.println(value);
        System.out.println(index);
    } 
}