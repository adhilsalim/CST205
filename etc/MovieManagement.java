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

        // GETTING NUMBER OF MOVIES
        System.out.print("ENTER NUMBER OF MOVIES: ");
        int total_movies = scan.nextInt();

        // CREATING OBJECTS OF MOVIE DETAILS CLASS
        MovieDetails movie[] = new MovieDetails[total_movies];

        String cast[] = new String[100]; // this is not the exact way to do it

        // GETTING MOVIE DETAILS [K IS USED TO STORE CAST]
        for (int i = 0, k = 0; i < movie.length; i++) {
            movie[i] = new MovieDetails();

            System.out.print("\nENTER MOVIE ID FOR MOVIE " + (i + 1) + ": ");
            movie[i].movieId = scan.nextInt();

            System.out.print("ENTER NAME FOR MOVIE " + (i + 1) + ": ");
            String md_movieName = scan.next();
            movie[i].movieName = md_movieName;

            System.out.print("ENTER CAST NUMBER FOR MOVIE " + (movie[i].movieName).toUpperCase() + ": ");
            int md_castNumber = scan.nextInt();

            movie[i].cast = new String[md_castNumber];

            for (int j = 0; j < md_castNumber; j++) {
                System.out.print("ENTER CAST " + (j + 1) + " FOR MOVIE " + (movie[i].movieName).toUpperCase() + ": ");
                movie[i].cast[j] = scan.next();
                cast[k] = movie[i].cast[j];
                k++;
            }

            System.out.print("ENTER YEAR FOR MOVIE " + (movie[i].movieName).toUpperCase() + ": ");
            movie[i].year = scan.nextInt();
        }

        // DISPLAYING MOVIE DETAILS
        for (int i = 0; i < movie.length && movie[i].movieId != -1; i++) {
            System.out.println("\n\nMOVIE ID: " + movie[i].movieId + " MOVIE NAME: " +
                    movie[i].movieName);
            System.out.print("CAST: ");

            for (int j = 0; j < movie[i].cast.length; j++) {
                System.out.print(movie[i].cast[j] + ", ");
            }

            System.out.println("MOVIE YEAR: " + movie[i].year);
        }

        scan.close();
    }
}
