import java.util.*;

//INCOMPLETE WORKING ON IT
class MovieDetails {
    int movieId;
    String movieName;
    String cast[];
    int year;
}

public class MovieManagement {

    // public void setDetails() {

    // }

    // public void getDetails() {

    // }

    public static void main(String[] args) {

        // MovieManagement movieManage = new MovieManagement();
        // movieManage.setDetails();
        // movieManage.getDetails();
        Scanner scan = new Scanner(System.in);

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
