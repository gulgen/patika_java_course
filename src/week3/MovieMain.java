package week3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieMain {

    public static void main(String[] args) {
        //Film nesnesi oluşturma
        List<Movie> movies =new ArrayList<>();

        movies.add(new Movie("Esaretin Bedeli", 9.3, "Gerilim", 1994));
        movies.add(new Movie("Hangover", 7.7, "Komedi", 2009));
        movies.add(new Movie("Dövüş Kulübü", 8.8, "Aksiyon", 1999));
        movies.add(new Movie("Forrest Gump", 8.8, "Komedi", 1994));
        movies.add(new Movie("İnception", 8.8 ,"Aksiyon", 2010 ));

        //IMDb puanına göre büyükten küçüğe sırala
        movies.sort((movie1, movie2) -> Double.compare(movie2.getImdbScore(), movie1.getImdbScore()));

        System.out.println("IMDb puanına göre sıralı filmler: ");
        for (Movie movie: movies){
            System.out.println(movie);
        }

        //Yayın yılına göre küçükten büyüğe sırala
        movies.sort(Comparator.comparingInt(Movie::getYearOfPublication));

        System.out.println("\nYayın yılına göre sıralı filmler: ");
        for(Movie movie : movies){
            System.out.println(movie);
        }

        filtreleVeYazdir(movies, "Aksiyon");
    }

    public static void filtreleVeYazdir(List <Movie> movies, String filmType) {
        System.out.println("Filtrelenen " + filmType + " türündeki filmler: ");
        for (Movie movie : movies){
            if (movie.getFilmType().equalsIgnoreCase(filmType)){
                System.out.println(movie);
            }
        }

    }
}
