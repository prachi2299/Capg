package p5;

@SuppressWarnings("serial")
public class NameEmptyException extends Exception{
	String firstname;
	String lastname;
	public NameEmptyException(String firstname, String lastname) {
	
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String toString() {
		return "NameIsBlankException:"+ firstname+lastname;
	}
	
}
