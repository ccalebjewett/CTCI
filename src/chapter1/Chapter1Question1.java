package chapter1;

/**
 * @author Clifton Caleb Jewett
 * Responding to 9781466208681 pg. 73:
 * "Implement an algorithm to determine if a string has all unique characters."
 */
public class Chapter1Question1 {
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
}
