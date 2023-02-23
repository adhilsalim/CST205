import java.util.*;

//INCOMPLETE WORKING ON IT
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

        MovieDetails md1 = new MovieDetails();
        MovieDetails md2 = new MovieDetails();
        movie[0] = md1;
        movie[1] = md2;

        for (int i = 0; i < movie.length; i++) {

            System.out.print("ENTER MOVIE ID: ");
            movie[i].movieId = scan.nextInt();

            System.out.print("ENTER MOVIE NAME: ");
            movie[i].movieName = scan.nextLine();

            System.out.print("ENTER MOVIE CAST NUMBER: ");
            int md_castNumber = scan.nextInt();

            for (int j = 0; j < md_castNumber; j++) {
                System.out.print("ENTER CAST " + (j + 1) + ": ");
                movie[i].cast[j] = scan.nextLine();
            }

            System.out.print("ENTER MOVIE YEAR: ");
            movie[i].year = scan.nextInt();
        }

        for (int i = 0; i < movie.length && movie[i].movieId != -1; i++) {
            System.out.println("MOVIE ID: " + movie[i].movieId + " MOVIE NAME: " + movie[i].movieName);
            System.out.print("CAST: ");

            for (int j = 0; j < movie[i].cast.length; j++) {
                System.out.print(movie[i].cast[j] + ", ");
            }

            System.out.println("MOVIE YEAR: " + movie[i].year);
        }

        scan.close();
    }
}
