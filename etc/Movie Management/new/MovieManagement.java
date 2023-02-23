import java.util.*;

class MovieDetails {
    int movieId;
    String movieName;
    String cast[];
    int year;
    MovieDetails md;
}

public class MovieManagement {
    static ArrayList<MovieDetails> movieList = new ArrayList<MovieDetails>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // GETTING NUMBER OF MOVIES
        System.out.print("ENTER NUMBER OF MOVIES: ");
        int total_movies = scan.nextInt();

        for (int i = 0; i < total_movies; i++) {
            new MovieDetails();

            System.out.print("\nENTER MOVIE ID FOR MOVIE : ");

            System.out.print("ENTER NAME FOR MOVIE : ");

            System.out.print("ENTER CAST NUMBER FOR MOVIE : ");

        }

    }
}