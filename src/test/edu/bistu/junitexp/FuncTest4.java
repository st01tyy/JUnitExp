package test.edu.bistu.junitexp;

import edu.bistu.junitexp.Func;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FuncTest4
{
    /**
     * 条件组合覆盖测试
     */

    static Func func;

    @BeforeAll
    public static void beforeAll()
    {
        func = new Func();
    }

    @ParameterizedTest
    @MethodSource("getParas")
    public void testFunc(int x, int y, int z, int expect)
    {
        Assertions.assertEquals(expect, func.Func(x, y, z));
    }

    public static Stream<Arguments> getParas()
    {
        return Stream.of(
                Arguments.of(1, 3, 6, 12),
                Arguments.of(1, 3, 8, 14),
                Arguments.of(1, 4, 6, 13),
                Arguments.of(1, 4, 8, 13),
                Arguments.of(1, 3, 5, 9),
                Arguments.of(2, 3, 6, 11),
                Arguments.of(2, 3, 8, 13),
                Arguments.of(2, 4, 6, 12),
                Arguments.of(2, 4, 8, 12),
                Arguments.of(2, 3, 5, 10),
                Arguments.of(2, 4, 5, 11)
        );
    }
}
