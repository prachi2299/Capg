package p1;

abstract public class WrittenItem extends Item {
	public WrittenItem(int number, String title, int numcopy, String authorname) {
		super(number, title, numcopy);
		// TODO Auto-generated constructor stub
	}
		private String authorname;
			
			public String getAuthorname() {
			return authorname;
		}
		public void setAuthorname(String authorname) {
			this.authorname = authorname;
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
