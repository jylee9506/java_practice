package org.zerock;

public class Movie {
    String movieName;
    int kissNum;
    int kickNum;

    public Movie(String movieName, int kissNum, int kickNum) {
        this.movieName = movieName;
        this.kissNum = kissNum;
        this.kickNum = kickNum;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", kissNum=" + kissNum +
                ", kickNum=" + kickNum +
                '}';
    }
}
