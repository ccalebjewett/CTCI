/**
 * @author Clifton Caleb Jewett
 * Responding to 9781466208681 pg. 52:
 * "Given a time, calculate the angle between the hour and minute hands."
 */

package chaptervi;

public class ChapterVIApproachI {
    /**
     * Takes the time in hours and minutes and returns the angle in degrees between the hour hand and minute hand.
     * @param hours - in range of [0, 23]
     * @param minutes - in range of [0, 59]
     * @return - angle in degrees between hour hand and minute hand
     */
    public static double clockHandsAngle(int hours, int minutes) {
        if(hours < 0 || hours > 23) {
            throw new IllegalArgumentException("hours must be within [0,23]");
        }
        if(minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("minutes must be within [0,59]");
        }
        double hoursInfluenceOnAngle = 30.0 * hours;
        double minutesInfluenceOnAngle = -5.5 * minutes;
        double angleBetweenHands = (hoursInfluenceOnAngle + minutesInfluenceOnAngle) % 360;
        return Math.abs(angleBetweenHands);
    }
}
