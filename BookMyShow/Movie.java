package BookMyShow;

enum Genre {
    HORROR,
    ROMANTIC,
    THRILLER
}

public class Movie {
    int id;
    String name;
    int duration;
    float rating;
    Genre genre;
    String description;
}
