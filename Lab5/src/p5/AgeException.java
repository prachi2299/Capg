package p5;

@SuppressWarnings("serial")
public class AgeException extends Exception {
int age;

public AgeException(int age) {
	
	this.age = age;
}

public String toString() {
	return "AgeUnder15Exception:"+age;
}

	
	
}
