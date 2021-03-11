package p2;

//import p2.Person;

public class Account {
private long accNum;
private double balance;
private Person accholder;
public long getAccNum() {
	return accNum;
}
public Account(double balance, Person accholder) {
	this.balance=balance;
	this.accholder=accholder;
}
public void setAccNum(long accNum) {
	this.accNum =  accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Person getAccholder() {
	return accholder;
}
public void setAccholder(Person accholder) {
	this.accholder = accholder;
}
public void deposit(double amount) {
	balance+=amount;
	System.out.println("Deposit "+amount+" \nBalance of Account Number " + getAccNum() + " is : " + balance);
	System.out.println();
}
public void withdraw(double amount) {
	balance-=amount;
	System.out.println("Balance of Account Number " + getAccNum() + " is : " + balance);
	System.out.println();
}


}
class SavingsAccount extends Account{
	final int minbalance=500;


	   
	   public SavingsAccount ( double initial_balance,Person accholder ) {

	      super (initial_balance,accholder);

	      

	   }  
	   @Override
	   public void withdraw(double amount) {


		      System.out.println ("Withdrawl from account " + getAccNum());
		      System.out.print ("Amount: " + amount);
              double currbalance=getBalance();
		      if ((currbalance-amount)<minbalance) {
		         System.out.println ("\nInsufficient funds.");}
		      else {
		         currbalance -= amount;
		         System.out.println ("\nNew balance: " + currbalance);
		      }
		      
		   }
}
	
class CurrentAccount extends Account{
	public CurrentAccount (double initial_balance,Person accholder) {

super (initial_balance,accholder);



}  
	double overdraftlim=1000,currbalance=getBalance();
	@Override
	public void withdraw(double amount) {

	      System.out.print ("Withdrawl from account " + getAccNum());
	      System.out.print (" of amount: " + amount);

	      if (amount > getBalance()) {
	          System.out.println ("Insufficient funds. using overlimit draft");
	          if( overdraftlim+getBalance()<amount) {
	          System.out.println("withdrawal not possible");}
	      }
	         
	      else {
		         currbalance-= amount;
		         System.out.println ("\nNew balance: " + currbalance);
		         setBalance(currbalance);
	      }
	      System.out.println ();


	   }
	      
	
}