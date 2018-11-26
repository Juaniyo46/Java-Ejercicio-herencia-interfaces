package com.company;


import java.util.Objects;

public class Multimedia {
    public enum formato {wav,mp3,midi,avi,mov,mpg,cdAudio,dvd}

    protected String tittle;
    protected String author;
    protected formato format;
    protected int duration;

    public Multimedia(String tittle, String author, formato format, int duration) {
        this.tittle = tittle;
        this.author = author;
        this.format = format;
        this.duration = duration;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public formato getFormat() {
        return format;
    }

    public void setFormat(formato  format) {
        this.format = format;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", format='" + format + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multimedia that = (Multimedia) o;
        return Objects.equals(tittle, that.tittle) &&
                Objects.equals(author, that.author);
    }

    }
