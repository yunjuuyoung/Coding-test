import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(); 
        int B = scanner.nextInt(); 
        int C = scanner.nextInt();

        int totalMinutes = A * 60 + B + C;

        int endHour = (totalMinutes / 60) % 24;
        int endMinute = totalMinutes % 60;

        System.out.println(endHour + " " + endMinute);
    }
}
