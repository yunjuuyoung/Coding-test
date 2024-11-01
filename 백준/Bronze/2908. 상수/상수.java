import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String str[] = st.split(" ");
        
        int A = Integer.parseInt(new StringBuilder(str[0]).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(str[1]).reverse().toString());
        
        System.out.println(A > B ? A : B);
    }
}
