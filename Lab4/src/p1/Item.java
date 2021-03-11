package p1;

public abstract class Item {
	private int number;
	private String title;
	private int numcopy;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumcopy() {
		return numcopy;
	}
	public void setNumcopy(int numcopy) {
		this.numcopy = numcopy;
	}
	
	public int checkin(int num) {
		return numcopy=numcopy+num;
	}
	public int checkout(int n) {
		return numcopy=numcopy-n;
	}
	public Item(int number,String title,int numcopy) {
		this.number=number;
		this.numcopy=numcopy;
		this.title=title;
	}
	@Override
	public String toString() {
		return "Item [number=" + number + ", title=" + title + ", numcopy=" + numcopy + "]";
	}
	
}
