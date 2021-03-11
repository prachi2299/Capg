package p1;

public class JournalPaper extends WrittenItem{
	private int pubyear;
		public JournalPaper(int id, String title, int numcopy,String author,int year) {
			super(id, title, numcopy,author);
			//System.out.println("year of publication");
		}
	
	

	public int getPubyear() {
			return pubyear;
		}



		public void setPubyear(int pubyear) {
			this.pubyear = pubyear;
		}



		@Override
		public String getAuthorname() {
			// TODO Auto-generated method stub
			return super.getAuthorname();
		}



		@Override
		public void setAuthorname(String authorname) {
			// TODO Auto-generated method stub
			super.setAuthorname(authorname);
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
