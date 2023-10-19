import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int length = 0;
        
        for(int i=0; i<input.length(); i++){
            length++;
        }
        System.out.println(length);
    }
}