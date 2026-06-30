
public class Movie {

    int movieId;
    String movieName;
    double ticketPrice;
    int availableSeats;

    public Movie(int movieId, String movieName, double ticketPrice, int availableSeats) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.availableSeats = availableSeats;
    }

    public void displayMovie() {
        System.out.println("--------------------------------------");
        System.out.println("Movie ID      : " + movieId);
        System.out.println("Movie Name    : " + movieName);
        System.out.println("Ticket Price  : ₹" + ticketPrice);
        System.out.println("Available Seats : " + availableSeats);
    }
}