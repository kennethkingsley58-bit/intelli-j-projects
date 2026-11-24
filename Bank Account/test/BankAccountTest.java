import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BankAccountTest {

    @Test
    public void testThatAccountHasDeposit5k_withdraw3k() {
        BankAccount account = new BankAccount();

        Assertions.assertEquals(0, account.getBalance());

        account.deposit(8_000);
        Assertions.assertEquals(8_000, account.getBalance());

        account.withdraw(3000);
        Assertions.assertEquals(5_000, account.getBalance());
    }

    @Test
    public void testThatWithdrawIsNotNegativeOfTheBalance() {
        BankAccount account = new BankAccount();

        Assertions.assertEquals(0, account.getBalance());

        account.deposit(8_000);
        Assertions.assertEquals(8_000, account.getBalance());

        account.withdraw(-12_0000);
        Assertions.assertEquals(8_000, account.getBalance());
    }

    @Test
    public void testThatWithdrawIsNotMoreThanTheBalance() {
        BankAccount account = new BankAccount();

        Assertions.assertEquals(0, account.getBalance());

        account.deposit(8_000);
        Assertions.assertEquals(8_000, account.getBalance());

        account.withdraw(12_0000);
        Assertions.assertEquals(8_000, account.getBalance());
    }

    @Test
    public void testThatAccountCanBeEmptied(){
        BankAccount account = new BankAccount();

        account.deposit(8_000);
        account.withdraw(8_000);

        Assertions.assertEquals(0, account.getBalance());
    }

    @Test
    public void testThatWithdrawingZeroDoesNotChangeBalance(){
        BankAccount account = new BankAccount();

        account.deposit(8_000);
        account.withdraw(0);

        Assertions.assertEquals(8_000, account.getBalance());
    }

}