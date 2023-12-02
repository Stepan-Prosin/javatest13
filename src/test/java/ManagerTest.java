import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Manager man = new Manager();
    PurchaseFilm film1 = new PurchaseFilm("Бладшот", "Боевик", true, 341, 1);
    PurchaseFilm film2 = new PurchaseFilm("Вперед", "Мультфильм", true, 150, 17);
    PurchaseFilm film3 = new PurchaseFilm("отель'Белград'", "Комедия", true, 111, 44);
    PurchaseFilm film4 = new PurchaseFilm("Джентльмены", "Боевик", true, 421, 2);
    PurchaseFilm film5 = new PurchaseFilm("Человек-невидимка", "Ужасы", true, 279, 14);
    PurchaseFilm film6 = new PurchaseFilm("Троли. Мировой тур", "Мультфильм", false, 131, 19);
    PurchaseFilm film7 = new PurchaseFilm("Номер один", "Комедия", false, 200, 10);

    @BeforeEach
    public void add() {
        man.add(film1);
        man.add(film2);
        man.add(film3);


    }

    @Test
    public void addTest() {
        man.add(film4);
        PurchaseFilm[] actual = man.findAll();
        PurchaseFilm[] expected = {film1, film2, film3, film4};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLowLimitMinTest() {


        PurchaseFilm[] expected = {film3, film2, film1};
        PurchaseFilm[] actual = man.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastNormTest() {
        man.add(film4);

        man.add(film5);
        PurchaseFilm[] expected = {film5, film4, film3, film2, film1};
        PurchaseFilm[] actual = man.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastUpLimitTest() {
        man.add(film4);
        man.add(film5);
        man.add(film6);
        man.add(film7);

        PurchaseFilm[] expected = {film7, film6, film5, film4, film3};
        PurchaseFilm[] actual = man.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void findConstructTest() {
        Manager newMan = new Manager(6);
        newMan.add(film1);
        newMan.add(film2);
        newMan.add(film3);
        newMan.add(film4);
        newMan.add(film5);
        newMan.add(film6);
        newMan.add(film7);

        PurchaseFilm[] expected = {film7, film6, film5, film4, film3,film2};
        PurchaseFilm[] actual = newMan.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}
