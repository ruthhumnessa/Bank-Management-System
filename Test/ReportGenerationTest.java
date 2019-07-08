package Test;

import DatabaseTier.Values;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class ReportGenerationTest extends Values {
    String attend = attendance;


    @Test
    public void testExistence(){
        assertNotNull(attendance);

    }

}
