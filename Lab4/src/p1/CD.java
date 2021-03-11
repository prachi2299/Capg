package p1;

public class CD extends MediaItem {

	public CD(int number, String title, int numcopy, int runtime) {
		super(number, title, numcopy, runtime);
		
		// TODO Auto-generated constructor stub
	}
	private String artist;
	private String genre;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
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
