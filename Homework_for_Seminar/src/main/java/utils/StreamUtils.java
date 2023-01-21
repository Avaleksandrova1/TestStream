package utils;

import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.Objects;

@UtilityClass
public class StreamUtils {

    public static long dimensionNumbersInStreamEndingZero(List<Integer> list) {
        if (Objects.isNull(list)) return 0;

        return list.stream()
                .filter(number->number % 10 == 0)
                .count();
    }
}
