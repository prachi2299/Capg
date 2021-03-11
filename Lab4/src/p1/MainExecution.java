package p1;

public class MainExecution {
	public static void main(String[] args) {
		Book b1=new Book(101,"DEF",10,"watson");
		b1.setAuthorname("watson");
	
		JournalPaper jp=new JournalPaper(111,"ab",5,"cd",2019);
		jp.setAuthorname("cd");
		jp.setPubyear(2019);
		
		Video v1=new Video(121,"df",9,45);
		v1.setDirector("ayk");
		v1.setGenre("pop");
		v1.setRelyear(2012);
		v1.setRuntime(45);
		
		CD cd=new CD(131,"ro",1000,60);
		cd.setGenre("rock");
		cd.setRuntime(70);
		cd.setArtist("klj");
		
		System.out.println("Book Details");
	    System.out.println("Book ID "+b1.getNumber());
	    System.out.println("Author name "+b1.getAuthorname());
	    System.out.println("Book Title "+b1.getTitle());
	    System.out.println("Number of copies "+b1.getNumcopy());
	    System.out.println("==========================");
	    System.out.println("Book checkout");
	    b1.checkout(2);
	    System.out.println("Number of copies "+b1.getNumcopy());
	    System.out.println("==========================");

	    System.out.println("Journal Paper detail");
	    System.out.println("Journal paper ID "+jp.getNumber());
	    System.out.println("Journal paper title "+jp.getNumber());
	    System.out.println("Journal paper author "+jp.getNumber());
	    System.out.println("Number of copies " +jp.getNumber());
	
	    System.out.println("==========================");

	    System.out.println("Video detail");
	    System.out.println("Video ID "+v1.getNumber()); 
	    System.out.println("Number of copies " +v1.getNumcopy());
	    System.out.println("Video title "+v1.getTitle());
	    System.out.println("Video genre "+v1.getGenre());
	    System.out.println("Video director "+v1.getDirector());
	    System.out.println("Video runtime "+v1.getRuntime()+" minutes");
	    System.out.println("Video release year "+v1.getRelyear());
	    System.out.println("==========================");

	    System.out.println("CD detail");
	    System.out.println("CD ID "+cd.getNumber()); 
	    System.out.println("CD title "+cd.getTitle());
	    System.out.println("CD genre "+cd.getGenre());
	    System.out.println("CD artist "+cd.getArtist());
	    System.out.println("CD runtime "+cd.getRuntime()+" minutes");
	    System.out.println("Number of copies " +cd.getNumcopy());
	
	
		
	}
}
