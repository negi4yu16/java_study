package test.ch05.ex02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.ch05.ex02.BankAccount;
import test.ch05.common.MyDJUnitTestCase;

public class BankAccountTest extends MyDJUnitTestCase {

	private BankAccount account;
	@Before
	public void setUp() throws Exception {
		account = new BankAccount();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeposit() {
		account.deposit(10000);
	}

	@Test
	public void testWithdraw() {
		account.withdraw(10000);
	}

	@Test
	public void testHistory1() {
		account.deposit(10000);
		account.withdraw(10000);
		account.deposit(20000);
		account.deposit(30000);

		BankAccount.History history = account.history();
		BankAccount.Action action;
		while((action = history.next()) != null ){
			System.out.println(action.toString());
		}
	}
	public void testHistory2() {
		account.deposit(10000);
		account.showHistory();
		System.out.println();
		account.withdraw(10000);
		account.deposit(20000);
		account.withdraw(20000);
		account.deposit(30000);
		account.withdraw(30000);
		account.deposit(40000);
		account.withdraw(40000);
		account.deposit(50000);
		account.withdraw(50000);
		account.showHistory();
		System.out.println();
		account.deposit(10000);
		account.showHistory();
		System.out.println();

	}

}
