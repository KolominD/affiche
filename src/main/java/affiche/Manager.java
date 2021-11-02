package affiche;


public class Manager {
    int countForFeed = 10;

    public Manager() {
    }


    public Manager(int countForFeed) {
        this.countForFeed = countForFeed;

    }


    private Movie[] movies = new Movie[0];

    public void add(Movie film) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        movies = tmp;
    }

    public Movie[] getAll() {
        Movie[] movies = findAll();
        Movie[] result = countForFeed < movies.length ? new Movie[countForFeed] : new Movie[findAll().length];

        int j = 0;
        for (int i = movies.length - 1; i >= 0; j++, i--) {
            result[j] = movies[i];
            if (countForFeed < movies.length && (movies.length - countForFeed) == i)
                break;
        }
        return result;
    }

    public Movie[] findAll() {
        return movies;
    }


}



