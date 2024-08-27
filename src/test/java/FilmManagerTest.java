import netology.FilmManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmManager manager = new FilmManager();

    @Test
    public void shouldSave() {
        manager.save("новый фильм");
        String[] expected = {"новый фильм"};
        String[] actual = manager.getAllFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastFilms() {
        manager.save("фильм1");
        manager.save("фильм2");
        manager.save("фильм3");

        String[] actual = manager.getLastFilms();
        String[] expected = {"фильм3", "фильм2", "фильм1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnAllFilms() {
        manager.save("фильм1");
        manager.save("фильм2");
        manager.save("фильм3");
        manager.save("фильм4");
        manager.save("фильм5");
        manager.save("фильм6");
        manager.save("фильм7");

        String[] actual = manager.getAllFilms();
        String[] expected = {"фильм1", "фильм2", "фильм3", "фильм4", "фильм5", "фильм6", "фильм7"};
        Assertions.assertArrayEquals(expected, actual);
    }

}
