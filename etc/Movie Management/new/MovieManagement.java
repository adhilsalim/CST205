import java.util.*;

/*
 * THIS PROGRAM IS NOT COMPLETE [WORKING ON IT]
 * REFRESH THE PAGE TO SEE THE UPDATED CODE (15 minutes)
 * ANY ERROR PLEASE REPORT
 */

//MOVIE DETAILS CLASS
class MovieDetails {
    int movieId;
    String movieName;
    String cast[];
    int year;
}

// THEATRE DETAILS CLASS
class TheatreDetails {
    int theatreId;
    String theatreName;
    Integer movie[];
}

public class MovieManagement {
    static ArrayList<MovieDetails> movieList = new ArrayList<MovieDetails>();
    static ArrayList<TheatreDetails> theatreList = new ArrayList<TheatreDetails>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        MovieDetails md;
        TheatreDetails td;

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

        // GETTING NUMBER OF THEATRES
        System.out.print("ENTER NUMBER OF THEATRES: ");
        int total_theatres = scan.nextInt();

        for (int i = 0; i < total_theatres; i++) {
            td = new TheatreDetails();

            System.out.print("\nENTER THEATRE ID FOR THEATRE : ");
            td.theatreId = scan.nextInt();

            scan.nextLine();
            System.out.print("ENTER NAME FOR THEATRE : ");
            td.theatreName = scan.nextLine();

            System.out.print("ENTER MOVIE ID FOR THEATRE : ");
            int td_movieId = scan.nextInt();

            td.movie = new Integer[td_movieId];
            for (int j = 0; j < td_movieId; j++) {
                System.out.print("ENTER MOVIE ID " + (j + 1) + " FOR THEATRE : ");
                // scan.nextLine();
                td.movie[j] = scan.nextInt();
            }

            theatreList.add(td);
        }

        // OPTIONS
        System.out.println("\nOPTIONS");
        System.out.println("1. DISPLAY MOVIE DETAILS");
        System.out.println("2. DELETE MOVIE BASED ON MOVIE ID");
        System.out.println("3. SORT MOVIE DETAILS BASED ON MOVIE YEAR");
        System.out.println("4. DISPLAY THEATRE DETAILS");
        System.out.println("5. DELETE THEATRE BASED ON THEATRE ID");
        System.out.println("6. DISPLAY MOVIES WITH SAME CAST");
        System.out.println("7. EXIT");

        // GETTING OPTION
        System.out.print("ENTER OPTION : ");
        int option = scan.nextInt();

        switch (option) {
            case 1:
                mm.displayMovieDetails();
                break;
            case 2:
                System.out.print("ENTER MOVIE ID TO DELETE : ");
                int movieId = scan.nextInt();
                mm.deleteMovie(movieId);
                break;
            case 3:
                mm.sortMovieDetails();
                break;
            case 4:
                mm.displayTheatreDetails();
                break;
            case 5:
                System.out.print("ENTER THEATRE ID TO DELETE : ");
                int theatreId = scan.nextInt();
                mm.deleteTheatre(theatreId);
                break;
            case 6:
                mm.displayMoviesWithSameCast();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("INVALID OPTION");
                break;
        }

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

    // DISPLAY THEATRE DETAILS
    public void displayTheatreDetails() {
        for (TheatreDetails td : theatreList) {
            System.out.println("THEATRE ID : " + td.theatreId);
            System.out.println("THEATRE NAME : " + td.theatreName);
            System.out.println("THEATRE MOVIE : " + Arrays.toString(td.movie));
        }
    }

    // DELETE THEATRE BASED ON THEATRE ID
    public void deleteTheatre(int theatreId) {
        for (TheatreDetails td : theatreList) {
            if (td.theatreId == theatreId) {
                theatreList.remove(td);
            }
        }
    }

    // DISPLAY MOVIES WITH SAME CAST
    public void displayMoviesWithSameCast() {
        for (MovieDetails md : movieList) {
            for (MovieDetails md1 : movieList) {
                if (md.movieId != md1.movieId) {
                    if (Arrays.equals(md.cast, md1.cast)) {
                        System.out.println("MOVIE ID : " + md.movieId);
                        System.out.println("MOVIE NAME : " + md.movieName);
                        System.out.println("MOVIE CAST : " + Arrays.toString(md.cast));
                        System.out.println("MOVIE YEAR : " + md.year);
                    }
                }
            }
        }
    }

    // GET CAST NAME AND DISPLAY THEATRE NAME WITH SAME CAST
    public void displayTheatreWithSameCast() {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER CAST NAME : ");
        String castName = scan.next();

        for (MovieDetails md : movieList) {
            for (String cast : md.cast) {
                if (cast.equals(castName)) {
                    for (TheatreDetails td : theatreList) {
                        for (Integer movie : td.movie) {
                            if (movie == md.movieId) {
                                System.out.println("THEATRE ID : " + td.theatreId);
                                System.out.println("THEATRE NAME : " + td.theatreName);
                                System.out.println("THEATRE MOVIE : " + Arrays.toString(td.movie));
                            }
                        }
                    }
                }
            }
        }

        scan.close();
    }
}