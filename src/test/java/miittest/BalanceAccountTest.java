package miittest;

import miit.BalanceAccount;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class BalanceAccountTest 
{
  BalanceAccount account;
  @Before
  public void setup()
  {
	  account=new BalanceAccount("jinal",2000);
  }
 @Test
 public void testdeposit()
 {
	 account.deposite(500);
	 assertEquals(2500,account.getbalance());
 }
 @Test
 public void testwithdraw()
 {
	 account.withdraw(200);
	 assertEquals(1800,account.getbalance());
 }
}
