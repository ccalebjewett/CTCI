/**
 * @author Clifton Caleb Jewett
 */

package chaptervi;

import static org.junit.Assert.*;

public class ChapterVIApproachIITest {

    @org.junit.Test
    public void findMinElementTest() throws Exception {
        assertEquals(1, ChapterVIApproachII.findMinElement(new int[] {1}));
        assertEquals(1, ChapterVIApproachII.findMinElement(new int[] {2, 3, 1}));
        assertEquals(3, ChapterVIApproachII.findMinElement(new int[] {6, 3, 4}));
        assertEquals(-1, ChapterVIApproachII.findMinElement(new int[] {2, -1, 0}));
        assertEquals(7, ChapterVIApproachII.findMinElement(new int[] {7, 8, 9, 10}));
        assertEquals(9, ChapterVIApproachII.findMinElement(new int[] {9, 10, 100}));
        assertEquals(7, ChapterVIApproachII.findMinElement(new int[] {10, 7, 8, 9}));
        assertEquals(1, ChapterVIApproachII.findMinElement(new int[] {2, 3, 1}));
        assertEquals(4, ChapterVIApproachII.findMinElement(new int[] {66, 77, 4, 5}));
        assertEquals(22, ChapterVIApproachII.findMinElement(new int[] {122, 222, 2222, 22}));
    }
}