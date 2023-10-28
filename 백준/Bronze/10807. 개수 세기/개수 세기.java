import java.util.Scanner;
public class Main{
    public static void main(String arga[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int input[] = new int[N];
        
        for(int i=0; i<N; i++){
            input[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for(int i = 0; i<input.length; i++){
            if(input[i] == v)
                count++;
        }
        System.out.println(count);
    }
}