import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){    // EOF일 경우 false 반환, 값이 있는 경우 true 반환함
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println((A+B));
        }
    }
}