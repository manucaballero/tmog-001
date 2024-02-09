package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
class SolutionTestV2 {

    @Test
    void testSolutionExample1() {

        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] response = Solution.twoSumV2(nums, target);

        assertNotNull(response);
        assertEquals(2, response.length);
        assertEquals(0, response[0]);
        assertEquals(1, response[1]);
    }

    @Test
    void testSolutionExample2() {

        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] response = Solution.twoSumV2(nums, target);

        assertNotNull(response);
        assertEquals(2, response.length);
        assertEquals(1, response[0]);
        assertEquals(2, response[1]);
    }

    @Test
    void testSolutionExample3() {

        int[] nums = new int[]{3,3};
        int target = 6;
        int[] response = Solution.twoSumV2(nums, target);

        assertNotNull(response);
        assertEquals(2, response.length);
        assertEquals(0, response[0]);
        assertEquals(1, response[1]);
    }

    @Test
    void testSolutionCustom1() {

        int[] nums = new int[]{0,0,3,3};
        int target = 6;
        int[] response = Solution.twoSumV2(nums, target);

        assertNotNull(response);
        assertEquals(2, response.length);
        assertEquals(2, response[0]);
        assertEquals(3, response[1]);
    }

    @Test
    void testSolutionCustom2() {

        int[] nums = new int[]{13,0,31,3};
        int target = 16;
        int[] response = Solution.twoSumV2(nums, target);

        assertNotNull(response);
        assertEquals(2, response.length);
        assertEquals(0, response[0]);
        assertEquals(3, response[1]);
    }

    @Test
    void testSolutionCustom3() {

        int[] nums = new int[]{-109,0,3,109};
        int target = 0;
        int[] response = Solution.twoSumV2(nums, target);

        assertNotNull(response);
        assertEquals(2, response.length);
        assertEquals(0, response[0]);
        assertEquals(3, response[1]);
    }

}