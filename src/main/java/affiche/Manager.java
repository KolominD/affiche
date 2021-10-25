package affiche;


import org.jetbrains.annotations.NotNull;

public class Manager {
    int countForFeed = 10;

    public Manager(int countForFeed) {
        this.countForFeed = 10;
    }

    public Manager() {

    }

    public String[] addFilm() {


        String[] films = {
                "Bloodshot",
                "Forward",
                "Hotel <Belgrad>",
                "Gentlemen",
                "Invisible man",
                "Trolls. Worldwide tour",
                "Number One"

        };
        String newFilm = "Road";
        String[] filmAdd = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            filmAdd[i] = films[i];
        }
        filmAdd[filmAdd.length - 1] = newFilm;
        films = filmAdd;
        return films;
    }
        public String[] feedFilms(String [] films) {

        int resultLength = 0;


        if (countForFeed > films.length) {
            resultLength = countForFeed;
        }
        String[] feedFilms = new String[resultLength];
        int j = 0;
        for (int i = films.length - 1; i >= 0; i--, j++) {
            feedFilms[j] = films[i];
        }
        return feedFilms;

    }
    }



