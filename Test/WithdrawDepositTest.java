package Test;

import DatabaseTier.Values;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

public class WithdrawDepositTest extends Values {
    long bala = balance;
    String accountNumber = clientAccNo;

    @Test
    public void testExistence(){
        assertNotNull(bala);
        assertNotNull(accountNumber);
        assertFalse(bala == 0);
    }

}
