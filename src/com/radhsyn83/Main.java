package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

public class Main {

    public static void main(String[] args) {
        // write your code here
        Film f = new Film();

        f.setFilmName("Venom");
        f.setFilmGenre("Action, Horror, SciFi");
        f.setFilmRating(8.5);
        f.setFilmDuration(95);
        f.nowPlaying();

        f.setFilmName("Small Foot");
        f.setFilmGenre("Animation");
        f.setFilmRating(9.0);
        f.setFilmDuration(96);
        f.nowPlaying();

        f.setFilmName("Crazy Rich Asian");
        f.setFilmGenre("Comedy");
        f.setFilmRating(7.8);
        f.setFilmDuration(119);
        f.nowPlaying();

        f.setFilmName("Asish");
        f.setFilmGenre("Horror");
        f.setFilmRating(6.0);
        f.setFilmDuration(100);
        f.nowPlaying();
    }
}
