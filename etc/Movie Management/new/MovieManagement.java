import java.util.*;

import javax.swing.event.MouseInputAdapter;

//MOVIE DETAILS CLASS
class MovieDetails {
    int movieId;
    String movieName;
    String cast[];
    int year;
    MovieDetails md;
}

// THEATRE DETAILS CLASS
class TheatreDetails {
    int theatreId;
    String theatreName;
    MovieDetails movie;
}

public class MovieManagement {
    static ArrayList<MovieDetails> movieList = new ArrayList<MovieDetails>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        MovieDetails md;
        MovieManagement mm = new MovieManagement();

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
            for (int j = 0; j < md_castNumber; j++) {
                System.out.print("ENTER CAST " + (j + 1) + " FOR MOVIE : ");
                // scan.nextLine();
                md.cast[j] = scan.next();
            }

            System.out.println("ENTER YEAR OF RELEASE FOR MOVIE : ");
            md.year = scan.nextInt();
            movieList.add(md);
        }
        mm.displayMovieDetails();
        mm.deleteMovie(2);
        scan.close();
    }

    // DISPLAYING MOVIE DETAILS
    public void displayMovieDetails() {
        for (MovieDetails md : movieList) {
            System.out.println("MOVIE ID : " + md.movieId);
            System.out.println("MOVIE NAME : " + md.movieName);
            System.out.println("MOVIE CAST : " + Arrays.toString(md.cast));
            System.out.println("MOVIE YEAR : " + md.year);
        }
    }

    // DELETE MOVIE BASED ON MOVIE ID
    public void deleteMovie(int movieId) {
        for (MovieDetails md : movieList) {
            if (md.movieId == movieId) {
                movieList.remove(md);
            }
        }
    }

    // SORT MOVIE DETAILS BASED ON MOVIE YEAR
    public void sortMovieDetails() {
        Collections.sort(movieList, new Comparator<MovieDetails>() {
            @Override
            public int compare(MovieDetails md1, MovieDetails md2) {
                return md1.year - md2.year;
            }
        });
    }
}