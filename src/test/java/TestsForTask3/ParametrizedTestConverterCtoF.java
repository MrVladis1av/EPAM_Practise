package TestsForTask3;

import TestingTask.TemperatureConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrizedTestConverterCtoF {
    @Parameterized.Parameter(0)
    public double c;
    @Parameterized.Parameter(1)
    public double f;

    @Parameterized.Parameters(name = "{index}: {0} Celsius equal to {1} Fahrenheits")
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0, 32},
                {1, 33.8},
                {2, 35.6},
                {3, 37.4},
                {4, 39.2},
                {5, 41},
        });
    }

    @Test
    public void testConverterCtoF() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(f, converter.convertCtoF(c), 0.1);
    }
}
