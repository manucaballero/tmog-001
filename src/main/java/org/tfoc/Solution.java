package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static int[] twoSumV1(
            int[] nums,
            int target) {

        boolean isFound = false;
        int[] response = new int[2];
        int counter = 0;
        while (!isFound && counter < nums.length - 1){
            int currentNumber = nums[counter];
            int secondPointer = counter + 1;
            while (!isFound && secondPointer < nums.length){
                int secondNumber = nums[secondPointer];
                if(currentNumber + secondNumber == target){
                    isFound = true;
                    response[0] = counter;
                    response[1] = secondPointer;
                }
                secondPointer++;
            }
            counter++;
        }

        return response;
    }

}
