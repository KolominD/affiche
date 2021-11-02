package affiche;

public class Movie {
    public Movie() {
    }

    public Movie(int id, String name, String genre, boolean premiere) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.premiere = premiere;
    }

    private int id;
    private String name;
    private String genre;
    private boolean premiere;

}
