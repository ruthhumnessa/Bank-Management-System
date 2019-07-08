package Test;

import DatabaseTier.Values;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class CreatingClerkTest extends Values {
    String userName = clerkUserName;
    String idNo = clerkId;

    @Test
    public void testExistence(){
        assertNotNull(userName);
        assertNotNull(idNo);
    }

}
