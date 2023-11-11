package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.Assertions;

import java.util.stream.Stream;

public class TwoSumTest {
    @ParameterizedTest
    @MethodSource("twoSumTestProvider")
    void twoSumTest(int[] nums, int target, int[] expected){
        TwoSum test = new TwoSum();
        int[] result = test.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }

    static Stream<Arguments> twoSumTestProvider() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0,1}),
                Arguments.of(new int[]{3,2,4}, 6, new int[]{1,2}),
                Arguments.of(new int[]{3,3}, 6, new int[]{0,1})
        );
    }

}
