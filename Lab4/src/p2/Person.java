package p2;

import java.util.Random;

public class Person {
private String name;
private float age;
public Person(String name, float age) {
this.name = name;
this.age = age;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getAge() {
	return age;
}
public void setAge(float age) {
	this.age = age;
}
public static void main(String args[]) {
	
	Person p1=new Person("Smith",26);

	Person p2=new Person("Kathy",30);
//Account a1=new Account(2000,p1);
//Account a2=new Account(3000,p2);
SavingsAccount sa1=new SavingsAccount(2000,p1);
CurrentAccount ca1=new CurrentAccount(3000,p2);
p1.Transaction(sa1);
p2.Transaction(ca1);

}
public void Transaction(Account account) {

{
	//account.deposit(2000);
	if(account instanceof SavingsAccount)
	{
		SavingsAccount sa=(SavingsAccount)account;
    	sa.setAccNum(Math.abs(new Random().nextLong()));
    	

		sa.withdraw(2000);
        sa.deposit(2000);

	}
	else if(account instanceof CurrentAccount) {
		CurrentAccount ca=(CurrentAccount)account;
    	
    	ca.setAccNum(Math.abs(new Random().nextLong()));


        ca.withdraw(2000);
	}
}

	
}
}

