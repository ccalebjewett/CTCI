/**
 * @author Clifton Caleb Jewett
 */

package chaptervi;

import static org.junit.Assert.*;

public class ChapterVIApproachITest {

    @org.junit.Test
    public void testClockHandsAngle() throws Exception {
        assertEquals(157.5, ChapterVIApproachI.clockHandsAngle(3, 45), 0.00001);
        assertEquals(61.0, ChapterVIApproachI.clockHandsAngle(2, 22), 0.00001);
        assertEquals(ChapterVIApproachI.clockHandsAngle(11, 57), ChapterVIApproachI.clockHandsAngle(23, 57), 0.00001);
        assertEquals(16.5, ChapterVIApproachI.clockHandsAngle(11, 57), 0.00001);
    }
}