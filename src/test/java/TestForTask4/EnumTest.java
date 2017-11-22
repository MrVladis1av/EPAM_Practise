package TestForTask4;

import EnumTask.Seasons;
import EnumTask.SpecEnum;
import org.junit.Assert;
import org.junit.Test;

public class EnumTest {
    @Test
    public void testEnum() {
        for (Seasons season :
                Seasons.values()) {
            Assert.assertEquals(SpecEnum.valueOf(season.name()).name(), season.name());
        }
    }
}
