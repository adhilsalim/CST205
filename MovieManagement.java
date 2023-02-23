import java.util.*;

//INCOMPLETE WORKING ON IT
class MovieDetails {
    int movieId;
    String movieName;
    String cast[];
    int year;
}

public class MovieManagement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF MOVIES: ");
        int total_movies = scan.nextInt();

        MovieDetails movie[] = new MovieDetails[total_movies];

        scan.close();
    }
}
