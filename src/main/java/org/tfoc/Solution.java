package org.tfoc;

import java.util.HashMap;
import java.util.Map;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static int[] twoSumV2(
            int[] nums,
            int target) {

        int[] response = new int[2];

        Map<Integer, Integer> values = new HashMap<>(); //Key -> NumericValue , Value -> Pos in 'nums' array
        boolean isFound = false;
        int counter = 0;

        while(!isFound && counter < nums.length){
            int currentValue = nums[counter];
            int difference = target - currentValue;
            Integer posFirstNumber = values.get(difference);

            if(posFirstNumber != null){

                isFound = true;
                response[1] = counter;
                response[0] = posFirstNumber;
            }
            values.put(currentValue, counter);
            counter++;
        }

        return response;
    }
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
