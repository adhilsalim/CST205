import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
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

public class MovieManagement implements ActionListener {
    static ArrayList<MovieDetails> movieList = new ArrayList<MovieDetails>();
    static ArrayList<TheatreDetails> theatreList = new ArrayList<TheatreDetails>();

    JFrame f;
    JTextField tMovieId;
    JLabel label;
    JButton bGet;

    public MovieManagement() {
        f = new JFrame("Movie Management");
        tMovieId = new JTextField();
        bGet = new JButton("GET");
        label = new JLabel();

        tMovieId.setBounds(50, 50, 150, 20);
        bGet.setBounds(50, 100, 100, 20);
        label.setBounds(50, 150, 300, 300);
        bGet.addActionListener(this);

        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.add(tMovieId);
        f.add(bGet);
        f.add(label);
    }

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

            System.out.print("ENTER MOVIE NUMBER FOR THEATRE :");
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
        Boolean EXIT_LOOP = false;
        while (!EXIT_LOOP) {
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
                    EXIT_LOOP = true;
                    break;
                default:
                    System.out.println("INVALID OPTION");
                    break;
            }
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
        Iterator<MovieDetails> itr = movieList.iterator();

        while (itr.hasNext()) {
            MovieDetails md = itr.next();
            if (md.movieId == movieId) {
                itr.remove();
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
        Iterator<TheatreDetails> itr = theatreList.iterator();
        while (itr.hasNext()) {
            TheatreDetails td = itr.next();
            if (td.theatreId == theatreId) {
                itr.remove();
            }
        }
    }

    // DISPLAY MOVIE NAME FOR EACH CAST
    public void displayMoviesWithSameCast() {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER CAST NAME : ");
        String castName = scan.next();

        for (MovieDetails md : movieList) {
            for (String cast : md.cast) {
                if (cast.equals(castName)) {
                    System.out.println("MOVIE NAME : " + md.movieName);
                    break;
                }
            }
        }

        scan.close();
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
                                System.out.println("THEATRE NAME : " + td.theatreName);
                            }
                        }
                    }
                }
            }
        }

        scan.close();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bGet) {
            if (tMovieId.getText() != null) {
                int movieId = Integer.parseInt(tMovieId.getText());
                String temp = "<html>";
                for (MovieDetails md : movieList) {
                    if (md.movieId == movieId) {
                        temp = temp.concat("MOVIE ID : " + md.movieId + "<br>");
                        temp = temp.concat("MOVIE NAME : " + md.movieName + "<br>");
                        temp = temp.concat("MOVIE CAST : " + Arrays.toString(md.cast) + "<br>");
                        temp = temp.concat("MOVIE YEAR : " + md.year + "<br>");
                    }
                }
                temp.concat("</html>");
                label.setText(temp);
            }
        }
    }
}