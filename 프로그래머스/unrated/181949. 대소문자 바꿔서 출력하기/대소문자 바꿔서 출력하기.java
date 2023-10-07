import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            
            if(Character.isLowerCase(c)){        // c가 소문자인지 확인
                result += Character.toUpperCase(c);     // c가 소문자이면 대문자로 변환하여 result 문자열에 추가
            }
            else{      // c가 대문자인 경우
                result += Character.toLowerCase(c);      // 소문자로 변환하여 result 문자열에 추가
            }
        }
        System.out.println(result);
    }
}