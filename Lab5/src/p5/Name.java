package p5;

public class Name {
	private String firstname;
	private String lastname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
    public void addName(String firstname,String lastname) throws NameEmptyException{
    	if(firstname.equals("") || lastname.equals("")) {
    		throw new NameEmptyException(firstname,lastname);
    	}
    	this.firstname=firstname;
    	this.lastname=lastname;
    	System.out.println("name added");
    }
}
