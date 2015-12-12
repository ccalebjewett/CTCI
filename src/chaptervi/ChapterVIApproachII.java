/**
 * @author Clifton Caleb Jewett
 * Responding to 9781466208681 pg. 52:
 * "A sorted array has been rotated so that the elements might appear in the order 3 4 5 6 7 1 2. How would you find the minimum element? You may assume that the array has all unique elements."
 */

package chaptervi;

public class ChapterVIApproachII {
    /**
     * Returns the smallest int value stored in a sorted array of unique ints that may be shifted.
     * Behavior with arrays not following these restrictions is undefined.
     * @param array - a sorted array of unique ints that may be shifted
     * @return - the smallest int value stored in the array
     */
    public static int findMinElement(int[] array) {
        if(array.length < 1) {
            throw new IllegalArgumentException("array is empty");
        }
        int left = 0;
        int right = array.length - 1;
        int mid = (left + right) / 2;
        while(left < right) {
            if(array[(mid - 1) % array.length] > array[mid]) {
                return array[mid];
            } else if (array[mid] < array[right]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        return array[mid];
    }
}
