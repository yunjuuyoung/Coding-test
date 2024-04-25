class Solution {
    public String solution(String my_string) {
        // String answer = "";
        // for (int i = 0; i < my_string.length(); i++) {
        //     char c = my_string.charAt(i);
        //     switch (c) {
        //         case 'a': break;
        //         case 'e': break;
        //         case 'i': break;
        //         case 'u': break;
        //         case 'o': break;
        //         default : 
        //             answer += c;
        //     }
        // }
        
        return my_string.replaceAll("[aeiou]", "");
    }
}