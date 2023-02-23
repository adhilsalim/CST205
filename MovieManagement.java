import java.util.*;

//INCOMPLETE WORKING ON IT
class MovieDetails {
    int movieId;
    String movieName;
    String cast[];
    int year;
}

public class MovieManagement {

    Scanner scan = new Scanner(System.in);

    public void setDetails() {
        System.out.print("ENTER NUMBER OF MOVIES: ");
        int total_movies = scan.nextInt();

        MovieDetails movie[] = new MovieDetails[total_movies];

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
    }

    public static void main(String[] args) {

        MovieManagement movieManage = new MovieManagement();
        movieManage.setDetails();
        // scan.close();
    }
}
