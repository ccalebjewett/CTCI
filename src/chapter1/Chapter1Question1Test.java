package chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Clifton Caleb Jewett
 */
public class Chapter1Question1Test {

    @Test
    public void testHasUniqueCharacters() throws Exception {

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 256; i++) {
            sb.append((char) i);
        }
        String largestStringOfUniqueCharacters = sb.toString();
        assertTrue(Chapter1Question1.hasUniqueCharacters(largestStringOfUniqueCharacters));

        assertTrue(Chapter1Question1.hasUniqueCharacters("abcdefg"));
        assertTrue(Chapter1Question1.hasUniqueCharacters("")); //it doesn't actually "have unique characters"... but at least it has no duplicates...
        assertFalse(Chapter1Question1.hasUniqueCharacters("aa"));
        String stringWithDuplicate = largestStringOfUniqueCharacters + "0";
        assertFalse(Chapter1Question1.hasUniqueCharacters(stringWithDuplicate));
    }

    @Test
    public void testHasUniqueCharacters2() throws Exception {

        StringBuffer sb = new StringBuffer();
        for(int i = 'a'; i <= 'z'; i++) {
            sb.append((char) i);
        }
        String largestStringOfUniqueCharacters = sb.toString();
        assertTrue(Chapter1Question1.hasUniqueCharacters2(largestStringOfUniqueCharacters));

        assertTrue(Chapter1Question1.hasUniqueCharacters2("abcdefg"));
        assertTrue(Chapter1Question1.hasUniqueCharacters2("")); //it doesn't actually "have unique characters"... but at least it has no duplicates...
        assertFalse(Chapter1Question1.hasUniqueCharacters2("aa"));
        String stringWithDuplicate = largestStringOfUniqueCharacters + "z";
        assertFalse(Chapter1Question1.hasUniqueCharacters2(stringWithDuplicate));
    }
}