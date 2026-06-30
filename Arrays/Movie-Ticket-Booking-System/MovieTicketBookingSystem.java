
import java.util.ArrayList;
import java.util.Scanner;

public class MovieTicketBookingSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Movie> movies = new ArrayList<>();

    public static void main(String[] args) {

        movies.add(new Movie(1, "Pushpa 2", 250, 50));
        movies.add(new Movie(2, "Salaar", 220, 40));
        movies.add(new Movie(3, "Kalki", 300, 35));

        int choice;

        do {

            System.out.println("\n========== MOVIE TICKET BOOKING ==========");
            System.out.println("1. Display Movies");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");

            choice = sc.nextInt();

            switch(choice){

                case 1:
                    displayMovies();
                    break;

                case 2:
                    bookTicket();
                    break;

                case 3:
                    cancelTicket();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);

    }

    static void displayMovies(){

        for(Movie m : movies){
            m.displayMovie();
        }

    }

    static void bookTicket(){

        System.out.print("Enter Movie ID : ");
        int id = sc.nextInt();

        for(Movie m : movies){

            if(m.movieId == id){

                System.out.print("Enter number of tickets : ");
                int tickets = sc.nextInt();

                if(tickets <= m.availableSeats){

                    m.availableSeats -= tickets;

                    double bill = tickets * m.ticketPrice;

                    System.out.println("\nBooking Successful!");
                    System.out.println("Movie : " + m.movieName);
                    System.out.println("Tickets : " + tickets);
                    System.out.println("Total Bill : ₹" + bill);

                }
                else{

                    System.out.println("Seats Not Available!");

                }

                return;
            }

        }

        System.out.println("Movie Not Found!");

    }

    static void cancelTicket(){

        System.out.print("Enter Movie ID : ");
        int id = sc.nextInt();

        for(Movie m : movies){

            if(m.movieId == id){

                System.out.print("Enter tickets to cancel : ");
                int tickets = sc.nextInt();

                m.availableSeats += tickets;

                System.out.println("Ticket Cancelled Successfully!");

                return;
            }

        }

        System.out.println("Movie Not Found!");

    }

}