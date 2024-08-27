package netology;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FilmManager {

    String[] films = new String[0];
    int lastFilmsAmount = 5;

    public void save(String newFilm) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;
    }

    public String[] getAllFilms() {
        for (String film : films) {
            System.out.println(film);
        }
        return films;
    }

    public String[] getLastFilms() {
          int resultLength;
        if (films.length >= lastFilmsAmount) {
            resultLength = lastFilmsAmount;
        } else {
            resultLength = films.length;
        }
        String[] result = new String[resultLength];

        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

}
