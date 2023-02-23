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
        MovieDetails md;

        // GETTING NUMBER OF MOVIES
        System.out.print("ENTER NUMBER OF MOVIES: ");
        int total_movies = scan.nextInt();

        for (int i = 0; i < total_movies; i++) {
            md = new MovieDetails();

            System.out.print("\nENTER MOVIE ID FOR MOVIE : ");
            md.movieId = scan.nextInt();

            scan.nextLine();
            System.out.print("ENTER NAME FOR MOVIE : ");
            md.movieName = scan.nextLine();

            System.out.print("ENTER CAST NUMBER FOR MOVIE : ");
            int md_castNumber = scan.nextInt();
            md.cast = new String[md_castNumber];
            // String cast[] = new String[md_castNumber];

            for (int j = 0; j < md_castNumber; j++) {
                System.out.print("ENTER CAST " + (j + 1) + " FOR MOVIE : ");
                md.cast[j] = scan.nextLine();
            }

            System.out.println("ENTER YEAR OF RELEASE FOR MOVIE : ");
            md.year = scan.nextInt();

            movieList.add(md);
        }

        scan.close();
    }
}