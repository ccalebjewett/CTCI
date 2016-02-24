package chapter1;

/**
 * @author Clifton Caleb Jewett
 * Responding to 9781466208681 pg. 73:
 * "Implement an algorithm to determine if a string has all unique characters."
 */
public class Chapter1Question1 {

    //CTCI says "[t]he time complexity for this code is O(n)", but for n sub 0 of 0, it is O(256), and, for n sub 0 of 257, it is O(1).
    public static boolean hasUniqueCharacters(String str) {
        if(str.length() > 256) { //assuming 256 unique ASCII characters are possible
            return false;
        }
        boolean[] charPresent = new boolean[256]; //assuming 256 unique ASCII characters are possible
        for(int i = 0; i < str.length(); i++) {
            int charValue = str.charAt(i);
            if(charPresent[charValue]) {
                return false;
            }
            charPresent[charValue] = true;
        }
        return true;
    }

    //now assuming 26 possible values, a to z
    public static boolean hasUniqueCharacters2(String str) {
        if(str.length() > 26) {
            return false;
        }
        int checker = 0;
        for(int i = 0; i < str.length(); i++) {
            int value = str.charAt(i) - 'a';
            if((checker & (1 << value)) > 0) {
                return false;
            }
            checker |= (1 << value);
        }
        return true;
    }
}
