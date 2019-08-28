/**
 * YuemengLi
 * COMP 3700 Assignment 2
 * return Min and Max value of a integer array
 */
public class Finder {

    public static Integer findMax(int[] intArray){
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
    }

    public static Integer findMin(int[] intArray){
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] < min) {
                min = intArray[i];
            }
        }
        return min;
    }
}