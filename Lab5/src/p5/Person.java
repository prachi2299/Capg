package p5;

public class Person {
private int age;
private String name;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + "]";
}
public Person() {
	super();
}
public void addPerson(String name,int age) throws AgeException{
	if(age<15) {
		throw new AgeException(age);}	
	this.name=name;
	this.age=age;
	System.out.println("info added");
	
	}
}

