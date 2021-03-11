package p1;

abstract public class MediaItem extends Item {
private int runtime;

public MediaItem(int number, String title, int numcopy,int runtime) {
	super(number, title, numcopy);
	// TODO Auto-generated constructor stub
}

public int getRuntime() {
	return runtime;
}

public void setRuntime(int runtime) {
	this.runtime = runtime;
}

@Override
public int getNumber() {
	// TODO Auto-generated method stub
	return super.getNumber();
}

@Override
public void setNumber(int number) {
	// TODO Auto-generated method stub
	super.setNumber(number);
}

@Override
public String getTitle() {
	// TODO Auto-generated method stub
	return super.getTitle();
}

@Override
public void setTitle(String title) {
	// TODO Auto-generated method stub
	super.setTitle(title);
}

@Override
public int getNumcopy() {
	// TODO Auto-generated method stub
	return super.getNumcopy();
}

@Override
public void setNumcopy(int numcopy) {
	// TODO Auto-generated method stub
	super.setNumcopy(numcopy);
}

@Override
public int checkin(int num) {
	// TODO Auto-generated method stub
	return super.checkin(num);
}

@Override
public int checkout(int n) {
	// TODO Auto-generated method stub
	return super.checkout(n);
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

}
