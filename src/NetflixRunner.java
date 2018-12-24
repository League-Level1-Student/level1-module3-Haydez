
public class NetflixRunner {
	public static void main(String[] args) {
		Movie m = new Movie("Spiderman: Into the Spider-verse", 9);
		Movie m1 = new Movie("Emoji Movie", -10);
		Movie m2 = new Movie("Avatar: The Last Airbender", 0);
		Movie m3 = new Movie("Deadpool 2", 8);
		Movie m4 = new Movie("Austin Powers: International Man of Mystery", 7);
		System.out.println(m1.getTitle());
		System.out.println(m1.getRating());
		System.out.println(m1.getTicketPrice());
		NetflixQueue n = new NetflixQueue();
		n.addMovie(m);
		n.addMovie(m1);
		n.addMovie(m2);
		n.addMovie(m3);
		n.addMovie(m4);
		System.out.println(n.getBestMovie());
	}
}
