package Test;

import DatabaseTier.Values;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class LoginTest extends Values {
    String clientName = clientUserName;
    String clerkName = clerkUserName;
    String passw = password ;
    String idNo;

    @Test
    public void testExistence(){
        assertNotNull(clientName);
        assertNotNull(clerkName);
        assertNotNull(passw);
        assertNotNull(idNo);
    }

}
