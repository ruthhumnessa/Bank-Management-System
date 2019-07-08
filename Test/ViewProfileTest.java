package Test;


import DatabaseTier.Values;
import com.sun.istack.internal.NotNull;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class ViewProfileTest extends Values {
    @Test
    public void accountNo(){
         String clientName = clientUserName;
         String clientAco = clientAccNo;
         String clerkUserNam = clerkUserName;
         String clerid = clerkId;
         String passwo = password;
         String attendan =attendance;
         long balan = balance;

         assertNotNull(clientName);
         assertNotNull(clientAco);
        assertNotNull(clerkUserNam);
        assertNotNull(clerid);
        assertNotNull(passwo);
        assertNotNull(balan);
        assertNotNull(attendan);






    }

}
