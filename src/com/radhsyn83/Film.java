package com.radhsyn83;

public class Film {
    private String filmName;
    private String filmGenre;
    private Double filmRating;
    private int filmDuration;

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public void setFilmRating(Double filmRating) {
        this.filmRating = filmRating;
    }

    public void setFilmDuration(int filmDuration) {
        this.filmDuration = filmDuration;
    }

    public void nowPlaying() {
        System.out.println("Judul Film : " + filmName);
        System.out.println("Genre Film : " + filmGenre);
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Durasi Film : " + filmDuration + " Menit");
        System.out.println();
    }
}
