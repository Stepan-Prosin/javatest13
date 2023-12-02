public class Manager {
    private final int lastFilmCount;
    private PurchaseFilm[] films = new PurchaseFilm[0];

    public Manager() {
        this.lastFilmCount = 5;
    }

    public Manager(int lastFilmCount) {
        this.lastFilmCount = lastFilmCount;
    }

    public void add(PurchaseFilm film) {
        PurchaseFilm[] tmp = new PurchaseFilm[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = film;
        films = tmp;
    }


    public PurchaseFilm[] findAll() {
        return films;
    }

    public PurchaseFilm[] findLast() {

        PurchaseFilm[] all = findAll();
        int minLength;
        if (all.length >= lastFilmCount) {
            minLength = lastFilmCount;
        } else {
            minLength = all.length;
        }
        PurchaseFilm[] reversed = new PurchaseFilm[minLength];
        for (int i = 0; i < minLength; i++) {

            reversed[i] = all[all.length - 1 - i];
        }

        return reversed;
    }
}