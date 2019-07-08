package Test;

import DatabaseTier.Constants;
import DatabaseTier.Values;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class CreateClientTest extends Values {

    String user = clientUserName;
    String accountNumber = clientAccNo;


    @Test
    public void testExistence(){
        assertNotNull(user);
        assertNotNull(accountNumber);

    }


}
