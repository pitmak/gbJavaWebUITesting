package lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {
    private static final Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, 6.0",
            "1, 1, 1, 0.4330127018922193",
            "1, 1, 0, 0.0"
    })
    @DisplayName("Набор позитивных тестов")
    void positiveTest(int a, int b, int c, double res) {
        logger.info(String.format("прогон с параметрами: %d, %d, %d", a, b, c));
        Assertions.assertEquals(Triangle.areaOf(a, b, c), res);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 10",
            "1, 2, 0",
            "1, 1, -1"
    })
    @DisplayName("Набор негативных тестов")
    void negativeTest(int a, int b, int c) {
        logger.info(String.format("прогон с параметрами: %d, %d, %d", a, b, c));
        Assertions.assertTrue(Double.isNaN(Triangle.areaOf(a, b, c)));
    }

}
