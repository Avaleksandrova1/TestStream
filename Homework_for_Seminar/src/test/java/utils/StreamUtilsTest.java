package utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для {@link StreamUtils}
 * @author Anastasia Aleksandrova
 */

class StreamUtilsTest {


    @Test
    void testWhenNoRequiredNumber_ChecksCorrectnessOfCondition_ThenComparesWithReturnedResult() {
        // given
        var list = new ArrayList<Integer>();
        list.add(1);
        // when
        var result = StreamUtils.
                dimensionNumbersInStreamEndingZero(list);

        // then

        assertEquals(0, result);
    }

    @Test
    void testWorkingConditions_ChecksCorrectnessOfCondition_ThenComparesWithReturnedResult() {
        // given
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(1318368300);
        list.add(12801210);
        list.add(22);
        // when
        var result = StreamUtils.
                dimensionNumbersInStreamEndingZero(list);

        // then

        assertEquals(2, result);
    }


    @Test
    void testWhenEmptyList_ThenReturnZero() {
        // given
        var list = new ArrayList<Integer>();

        // when
        var result = StreamUtils.
                dimensionNumbersInStreamEndingZero(list);

        // then

        assertEquals(0, result);
    }

    @Test
    void testWhenNull_ThenComparesWithZeroReturned() {
        // given
        // when
        var result = StreamUtils.
                dimensionNumbersInStreamEndingZero(null);

        // then

        assertEquals(0, result);
    }
}