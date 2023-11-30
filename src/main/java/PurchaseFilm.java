public class PurchaseFilm {


    private final int filmId;
    private final String filmName;
    private final String filmType;
    private final boolean flimAvailable;
    private final int filmPrice;

    public PurchaseFilm(String filmName, String filmType, boolean flimAvailable, int filmPrice, int filmId) {
        this.filmName = filmName;
        this.filmType = filmType;
        this.flimAvailable = flimAvailable;
        this.filmPrice = filmPrice;
        this.filmId = filmId;
    }


}