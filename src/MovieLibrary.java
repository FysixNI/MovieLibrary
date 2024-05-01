import java.util.ArrayList;
public class MovieLibrary {

    private ArrayList<Movie> movies;

    public MovieLibrary() {

        movies = new ArrayList<Movie>();

    }

    public void addMovie (Movie m){

        this.movies.add(m);
    }

    public void showMovies(){

        for(Movie m : this.movies){

            m.showInfo();

        }
    }

    public int movieCount(){

        int count = this.movies.size();

        return count;
    }






}
