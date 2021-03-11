package p1;

public class Video extends MediaItem{

	public Video(int number, String title, int numcopy,int runtime) {
		super(number, title, numcopy, runtime);
		// TODO Auto-generated constructor stub
	}
	private String director;
	private String genre ;
	private int relyear;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRelyear() {
		return relyear;
	}
	public void setRelyear(int relyear) {
		this.relyear = relyear;
	}
	@Override
	public int getRuntime() {
		// TODO Auto-generated method stub
		return super.getRuntime();
	}
	@Override
	public void setRuntime(int runtime) {
		// TODO Auto-generated method stub
		super.setRuntime(runtime);
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
