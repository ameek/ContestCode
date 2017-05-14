package hecker_earth;

/**
 * Created by ameek on 4/3/17.
 */
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char[] charArray = word.toCharArray();
        System.out.println(isPalindorme(charArray));
    }

    public static String isPalindorme(char[] charArray) {
        int intial = 0;
        int end = charArray.length - 1;
        while (end > intial){
            if (charArray[intial] != charArray[end]){
                return "NO";
            }
            ++intial;
            --end;
        }
        return "YES";
    }
}
