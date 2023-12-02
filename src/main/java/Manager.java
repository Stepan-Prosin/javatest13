public class Manager {
    private PurchaseFilm[] films = new PurchaseFilm[0];
    private  int lastFilmCount;

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
        if(all.length < lastFilmCount)
        {
            lastFilmCount=lastFilmCount-lastFilmCount+ all.length;
        }
        PurchaseFilm[] reversed = new PurchaseFilm[lastFilmCount];
        for (int i = 0; i < lastFilmCount; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        lastFilmCount=lastFilmCount;
        return reversed;
    }
}