package affiche;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    public void films() {
        Manager man = new Manager(10);
        String[] actual = man.addFilm();
        String[] expected =  {
                "Bloodshot",
                "Forward",
                "Hotel <Belgrad>",
                "Gentlemen",
                "Invisible man",
                "Trolls. Worldwide tour",
                "Number One",
                "Road"

        };
        assertArrayEquals(expected, actual);
    }
}