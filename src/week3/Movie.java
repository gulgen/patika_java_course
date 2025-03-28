package week3;

public class Movie {

        private String name;
        private int yearOfPublication;
        private String filmType;
        private double imdbScore;

   //Constructor
    public Movie(String name, double imdbScore, String filmType, int yearOfPublication) {
        this.name = name;
        this.imdbScore = imdbScore;
        this.filmType = filmType;
        this.yearOfPublication = yearOfPublication;
    }

    //Getter-Setter metotları
    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }

    public void setImdbScore(double imdbScore) {
        this.imdbScore = imdbScore;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getFilmType() {
        return filmType;
    }

    public double getImdbScore() {
        return imdbScore;
    }

    //Film bilgileri için toString metodu
    @Override
    public String toString() {
        return "MovieAndCollectionFiltering{" +
                "name='" + name + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", filmType='" + filmType + '\'' +
                ", imdbScore=" + imdbScore +
                '}';
    }
}
