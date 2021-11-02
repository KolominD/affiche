package affiche;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerTest {
    private Manager manager = new Manager();
    private Movie first = new Movie(1, "Bloodshot", "Action", false);
    private Movie second = new Movie(2, "Forward", "Cartoon", false);
    private Movie third = new Movie(3, "Hotel <Belgrad>", "Comedy", false);
    private Movie forth = new Movie(4, "Gentlemen", "Action", false);
    private Movie fifth = new Movie(5, "Invisible man", "Thriller", false);
    private Movie sixth = new Movie(6, "Trolls. Worldwide tour", "Cartoon", true);
    private Movie seventh = new Movie(7, "Number one", "Comedy", true);
    private Movie nine = new Movie();


    @Test
    public void add() {
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        Movie[] actual = manager.findAll();
        Movie[] expected = new Movie[]{first, second};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void add2() {
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        Movie[] actual = manager.findAll();
        Movie[] expected = new Movie[]{first, second, third, forth};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void feed() {
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{second, first};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void feed2() {
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{forth, third, second, first};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void feed3() {
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{forth, third, second, first};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void feed4() {
        Manager manager = new Manager(3);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{fifth, forth, third};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void feed5() {
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{fifth, forth, third, second, first};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void feed6() {
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        manager.add(nine);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{nine,fifth, forth, third, second, first};
        assertArrayEquals(actual, expected);
    }


}