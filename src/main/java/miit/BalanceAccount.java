package miit;

public class BalanceAccount 
{
  String owner;
  int balance;
  
  public BalanceAccount(String ownername,int accountbalance)
  {
	  owner=ownername;
	  balance=accountbalance;
  }
  public void deposite(int amount)
  {
	  balance=balance+amount;
	  
  }
  public boolean withdraw(int amount)
  {
	  if(amount<=balance)
	  {
		  balance=balance-amount;
		  return true;
	  }
	  else
	  {
		  System.out.println("insufficiant fund");
		  return false;
	  } 
  }
  public int getbalance()
  {
	  return balance;
  }
}

