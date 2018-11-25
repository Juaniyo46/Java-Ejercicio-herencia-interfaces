package com.company;

public class Multimedia {
    protected String tittle;
    protected String author;
    protected String format;
    protected int duration;

    public Multimedia(String tittle, String author, String format, int duration) {
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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
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

    public boolean tittleAndAuthor (String tittle, String author) {
        boolean igual = false;
        if (author == tittle) igual = true;
        return igual;
    }
}
