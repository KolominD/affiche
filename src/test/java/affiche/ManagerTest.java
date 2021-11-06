package affiche;

import org.junit.jupiter.api.Test;


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
    private Movie nine = new Movie(8,"Cat","Cartoon", true);
    private Movie tenth = new Movie(9,"Dog","Thriller",true);
    private Movie eleventh = new Movie(10,"Garden","Action",true);
    private Movie twelfth = new Movie(11, "Rock","Cartoon",true);


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
    @Test
    public void feedWithLimitMoreThanFilms (){
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(nine);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{nine,seventh, sixth, fifth, forth, third, second, first};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void feedWithLimitLessThanFilms (){
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(nine);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{twelfth,eleventh, tenth, nine,seventh, sixth, fifth, forth, third, second};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void feedWithLimitIsEqualToFilms (){
        Manager manager = new Manager();
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(nine);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{twelfth,eleventh, tenth, nine,seventh, sixth, fifth, forth, third, second};
        assertArrayEquals(actual, expected);
    }





}