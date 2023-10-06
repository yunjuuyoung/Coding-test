import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        
        Scanner sc = new Scanner(System.in);
        int a, b;
        int one, two, three;
        a = sc.nextInt();
        b = sc.nextInt();
        one = (((b%100)%10))*a;
        two = ((b%100)/10)*a;
        three = (b/100)*a;
        
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(a*b);
        
    }
}