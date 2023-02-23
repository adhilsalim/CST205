import java.util.*;

/*
 * THIS PROGRAM IS NOT COMPLETE [WORKING ON IT]
 */

class MovieDetails {
    int movieId;
    String movieName;
    String cast[];
    int year;
    MovieDetails md;
}

public class MovieManagement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF MOVIES: ");
        int total_movies = scan.nextInt();

        MovieDetails movie[] = new MovieDetails[total_movies];

        for (int i = 0; i < movie.length; i++) {
            movie[i] = new MovieDetails();

            System.out.print("ENTER MOVIE ID FOR MOVIE " + (i + 1) + ": ");
            movie[i].movieId = scan.nextInt();

            System.out.print("ENTER MOVIE NAME FOR MOVIE " + (i + 1) + ": ");
            String md_movieName = scan.next();
            movie[i].movieName = md_movieName;

            System.out.print("ENTER MOVIE CAST NUMBER FOR MOVIE " + movie[i].movieName + ": ");
            int md_castNumber = scan.nextInt();

            for (int j = 0; j < md_castNumber; j++) {
                movie[i].cast = new String[md_castNumber];

                System.out.print("ENTER CAST " + (j + 1) + " FOR MOVIE " + movie[i].movieName + ": ");
                movie[i].cast[j] = scan.next();
            }

            System.out.print("ENTER MOVIE YEAR FOR MOVIE " + movie[i].movieName + ": ");
            movie[i].year = scan.nextInt();
        }

        // for (int i = 0; i < movie.length && movie[i].movieId != -1; i++) {
        // System.out.println("MOVIE ID: " + movie[i].movieId + " MOVIE NAME: " +
        // movie[i].movieName);
        // System.out.print("CAST: ");

        // for (int j = 0; j < movie[i].cast.length; j++) {
        // System.out.print(movie[i].cast[j] + ", ");
        // }

        // System.out.println("MOVIE YEAR: " + movie[i].year);
        // }

        scan.close();
    }
}
